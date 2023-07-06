package day_04;

//Manager/Service는 getter,setter를 만들지 않는다. 두가지는 VO에 만들어준다.

//* 클래스 종류
//1. VO	- 데이터 저장용
//2. Manager/Service - VO의 CRUD용
//3. UI 
//4. IO

//데이터의 처리과정을 현재 해당 클래스에서 처리된다. Manager/Service 클래스
public class MyMemberService {
	private MyMember[] mems = new MyMember[300]; //mems는 MyMember의 배열타입을 가리킨다. MyMember클래스로 만들어준 객체를 저장하기 위한 객체배열.
	private int count = 0; // 다음에 저장될 객체의 위치와 현재까지 저장된 갯수를 의미한다.
	
	//회원 등록
	public void add(MyMember mm) {
		mems[count]=mm;
		count++;
	}
	
	//저장된 갯수와 다음에 저장되는 위치를 알려주는 메서드
	public int getCount() {
		return count;
	}

	public void printAll() {
		System.out.println("** 전쳬 출력 **");
		System.out.println("* 저장갯수 = "+count);
		for(int i=0; i<count; i++) {
			System.out.println(mems[i]);
		}//end for
	}//end printAll()
	
	//검색
	public MyMember searchByName(String findName) {
		for(int i=0; i<count; i++) {
			if(findName==mems[i].getName()) {
				return mems[i];
			}
		}//end for
		return null; // 검색실패시 반환하는 값.
	}

	//수정
	public boolean update(String name, int i) {
		MyMember m=searchByName(name);
		if(m==null)
			return false; //작업실패
		int age= m.getAge();
		m.setAge(age+i	);
		return true; //작업성공
	}
}