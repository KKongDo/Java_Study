package day_04;

public class MyMemberExam2 {
	public static void main(String[] args) {
		// CRUD용 클래스를 만들어줘서 유지보수를 용이하게 함.
		MyMemberService ms = new MyMemberService();
		
		// 사람 객체를 만들어서 CRUD용 클래스에 저장시킨다.모델크
		MyMember mm=new MyMember("홍길동",33);
		//회원등록
		ms.add(mm);
		
		mm=new MyMember("김길동",35);
		ms.add(mm);
		
		mm=new MyMember("박길동",30);
		ms.add(mm);
		
		//목록출력
		ms.printAll();
		
		//회원검색 
		//- 김길동의 참조값을 반환 방법 or 순서번호 반환 방법, 순서번호로 반환받으면 문제가 발생할 수 있음. (문제가 발생하지 않기 위해서는 혼자 사용할때만. but 같이 사용할때는 문제발생), 
		//여기서는 참조값 반환방법으로 사용
		//검색의 성공/실패 
		//1. 성공 : 양수(인덱스 번호), 실패 : -1 반환해야함. -> 옛날방식임.(C언어 스타일)
		//2. true/false -> 검색기능에 부적합.
		//3. 참조값 : 성공시 참조값/ 실패시 null -> (JAVA 스타일)
		MyMember findMem=ms.searchByName("김길동");
		if(findMem == null)
			System.out.println("못찾았음");
		else
			System.out.println("찾았음 : "+findMem);
		
		//수정 - 김길동의 나이 1증가
		boolean b=ms.update("김길동",1);
		if(b)
			System.out.println("수정성공");
		else
			System.out.println("수정실패");
	}
}