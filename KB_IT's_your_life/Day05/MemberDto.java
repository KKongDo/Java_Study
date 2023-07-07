package day_05;

//모델클래스는 기본생성자, 모든매개변수를 가지는 생성자, 게터와 세터, toString()을 만든다.
public class MemberDto {
	private int mno;
	private String name, tel;
	
	//생성자
	public MemberDto() {
		
	}
	
	public MemberDto(int mno, String name, String tel) {
		super();
		this.mno = mno;
		this.name = name;
		this.tel = tel;
	}
	
	//getter,setter
	public int getMno() {
		return mno;
	}

	public void setMno(int mno) {
		this.mno = mno;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	//toString()
	@Override
	public String toString() {
		return "MemberDto [mno=" + mno + ", name=" + name + ", tel=" + tel + "]";
	}
}
