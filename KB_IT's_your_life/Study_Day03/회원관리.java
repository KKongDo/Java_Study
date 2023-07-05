package day_03;

public class 회원관리 {
	public static void main(String[] args) {
//		MyMember m1=new MyMember("홍길동",33,"111-222");
//		MyMember m2=new MyMember("김길동",35,"111-333");
		
		MyMember[] mems=new MyMember[3]; //ctrl+1을 누르면 마우스와 똑같은 기능이다. 배열객체 한개가 만들어 진거며 배열객체안에 배열이 만들어진거다. 사용자정의형이므로 기본값은 null값이다.
		mems[0]=new MyMember("홍길동",33,"111-222");
		System.out.println(mems[0].toString());
	}
}
