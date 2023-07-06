package day_04;

public class SchoolService {
	private Person[] parr=new Person[100];
	private int pCount=0;
	
	//밑에 두개가 쓰기 귀찮으면 업캐스팅으로 받아준다.
	public void add(Person p) {
		parr[pCount++]=p;
	}

	
//	public void add(Student st) {
//		parr[pCount++]=st;
//	}
//
//	public void add(Emp emp) {
//		parr[pCount++]=emp;
//	}
}
