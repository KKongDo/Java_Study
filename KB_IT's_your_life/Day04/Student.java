package day_04;

public class Student extends Person{
	private String hakgwa;
	
	public Student() { //서브클래스를 선언할때 부모클래스의 기본생성자부터 실행 후 자식크래스의 기본생성자를 실행한다.
	}

	//생성자로 변수를 초기화한다.
	public Student(String id, String name, String hakgwa) {
		super(id,name); 
//		setId(id);
//		setName(name);
		this.hakgwa=hakgwa;
	}

	public String getHakgwa() {
		return hakgwa;
	}
	public void setHakgwa(String hakgwa) {
		this.hakgwa = hakgwa;
	}

	@Override
	public String toString() {
		return super.toString()+", "+"hakgwa=" + hakgwa;
	}
	
	//final 클래스는 더이상 상속을 할 수 없는 클래스라는 의미.
	
}