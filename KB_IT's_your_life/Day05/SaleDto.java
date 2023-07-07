package day_05;

//모델클래스(DTO)를 만들떄는 생성자, 게터세터, toString()를 만든다.
public class SaleDto {
	private int mno;
	private String isbn;
	private int quatity; //구매한 책수
	
	//기본생성자
	public SaleDto() {
		
	}
	//모든 매개변수를 받는 생성자
	public SaleDto(int mno, String isbn, int quatity) {
		super();
		this.mno = mno;
		this.isbn = isbn;
		this.quatity = quatity;
	}

	//getter, setter
	public int getMno() {
		return mno;
	}

	public void setMno(int mno) {
		this.mno = mno;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public int getQuatity() {
		return quatity;
	}

	public void setQuatity(int quatity) {
		this.quatity = quatity;
	}

	//toString()
	@Override
	public String toString() {
		return "SaleDto [mno=" + mno + ", isbn=" + isbn + ", quatity=" + quatity + "]";
	}
	
}
