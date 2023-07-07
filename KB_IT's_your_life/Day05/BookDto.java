package day_05;

//모델클래스를 만들떄는 생성자, 게터세터, toString()를 만든다.
public class BookDto {
	private String isbn, title;
	private int price;
	
	//생성자 만든다. 두개를 만든다.
	public BookDto() {
		
	}
	public BookDto(String isbn, String title, int price) {
		super();
		this.isbn = isbn;
		this.title = title;
		this.price = price;
	}
	
	//Getter, Setter
	public String getIsbn() {
		return isbn;
	}
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	//toString()
	@Override
	public String toString() {
		return "BookDto [isbn=" + isbn + ", title=" + title + ", price=" + price + "]";
	}
}
