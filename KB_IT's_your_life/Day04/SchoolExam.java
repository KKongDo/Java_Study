package day_04;

public class SchoolExam {
	public static void main(String[] args) {
		//학교 내 인원 관리
		//관리대상 : 학생, 교수, 직원
		//학생 - 학번, 이름, 학과
		//교수 - 교번, 이름, 연구실 호수
		//직원 - 사번, 이름, 부서
		
		//class Person{id, name}
		//class Student extends Person{hakgwa}
		//class Teacher extends Person{yeongusil}
		//class Emp extends Person{buseo}
		
		
		Person p=new Person("100","홍길동");
		System.out.println(p);
		
		Student st=new Student("200","김길동","컴공");
		System.out.println(st);
		
		Emp emp=new Emp("300","박길동","개발");
		System.out.println(emp);
	
		// 업캐스팅. 업캐스팅을 하는 이유 : 편리한 관리를 위해서
		p=st;
		p=emp;
		System.out.println(p);
		//업캐스팅이랄지라도 자식이 오버라이드한 메서드를 가지고 있으면 무조건 재정의 메서드가 실행된다.
		
		Person[] pa=new Person[100];
		pa[0]=st;
		pa[1]=emp;
		
		//학교인원관리 기능
		SchoolService ss=new SchoolService();
		ss.add(st);
		ss.add(emp);
		//
		System.out.println(st instanceof Student); //Student타입 혹은 Student의 자식타입이냐 까지 묻는거임
		System.out.println(st instanceof Person);
		
		//다운캐스팅을 할려고 하면 instanceof를 무조건 사용해서 타입을 확인하고 수행한다.
		if(p instanceof Student) {
			Student st2=(Student)p; //다운캐스팅
			System.out.println("학생입니다.");
		}
		else
			System.out.println("학생이 아닙니다.");
	
	
	}
}
