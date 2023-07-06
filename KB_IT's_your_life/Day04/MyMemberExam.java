package day_04;

public class MyMemberExam {
	public static void main(String[] args) {
		//회원정보 관리-등록, 검색, 수정, 삭제 4가지 기능이 있어야 함.(CRUD)
		//회원 : 이름, 나이
		
//		MyMember m1 = new MyMember("홍길동",34); //오류가 발생한 부분으로 ctrl+ . 으로 바로 갈 수 있음
//		System.out.println(m1);
//		System.out.println(m1.toString());
		
//		MyMember[] mems1 = {new MyMember(),new MyMember(),new MyMember()};
		
		MyMember[] mems = new MyMember[300]; //mems는 MyMember의 배열타입을 가리킨다.
		int count = 0; //객체를 저장할 위치 -> 저장갯수를 의미한다.
		
		//회원등록(Create)
		mems[count++]=new MyMember("홍길동",33);
		mems[count++]=new MyMember("김길동",35);
		mems[count++]=new MyMember("박길동",30);
		//count++이기 때문에 여기서는 다음에 저장할 위치를 알려준다.
		System.out.println("count = " + count);
		
		//목록출력
		System.out.println("*** 목록 ***");
		for(int i=0; i < count; i++) {
			System.out.println(mems[i]);
		}
		
		//회원검색
		String findName = "김길동";
		System.out.println("** 회원 검색 **");
		int targetIndex = -1; // 찾은 회원의 위치번호.
		
		for (int i = 0; i < count; i++) {
			if(findName == mems[i].getName()) {
				targetIndex=i;
			}
		}
		
		if(targetIndex==-1) {
			System.out.println("못찾았음");
		}
		else {
			System.out.println("찾았음 : "+mems[targetIndex]);
		}
		
		//회원수정 - Ex) 김길동의 나이를 1증가시킨다. 이를 위해서 먼저 검색을 수행
		findName = "김길동";
		System.out.println("** 회원 수정 **");
		targetIndex = -1; // 찾은 회원의 위치번호.
		
		for (int i = 0; i < count; i++) {
			if(findName == mems[i].getName()) {
				targetIndex=i;
			}
		}
		
		if(targetIndex==-1) {
			System.out.println("못찾았음");
		}
		else {
			int age=mems[targetIndex].getAge();
			mems[targetIndex].setAge(age+1);
			System.out.println("수정 후 : "+mems[targetIndex]);
		}
		
		//회원삭제 - Ex) 김길동을 삭제한다. 이를 위해 먼저 검색을 수행.
		findName = "김길동";
		System.out.println("** 회원 검색 **");
		targetIndex = -1; // 찾은 회원의 위치번호.
		
		for (int i = 0; i < count; i++) {
			if(findName == mems[i].getName()) {
				targetIndex=i;
			}
		}
		
		if(targetIndex==-1) {
			System.out.println("못찾았음");
		}
		else {
			mems[targetIndex] = mems[targetIndex+1]; //targetIndex에 targetIndex+1값을 덮어쓰인다.
			count--;
		}
		
		//다시 검색
		System.out.println("*** 삭제 후 목록 ***");
		for(int i=0; i < count; i++) {
			System.out.println(mems[i]);
		}
	}
}