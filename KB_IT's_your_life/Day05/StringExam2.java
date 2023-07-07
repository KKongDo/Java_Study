package day_05;

public class StringExam2 {
	public static void main(String[] args) {
		String s="홍길동";
		String s2="멀티캠퍼스";
		
		System.out.println(s.length());  // 문자열 길이
		System.out.println(s.charAt(0)); // 문자추출
		System.out.println(s.charAt(1));
		System.out.println(s2.indexOf("캠퍼스"));  //검색, 해당글자가 시작하는 위치를 알려줌.
		System.out.println(s.startsWith("김"));  //매개변수값이 시작하는 글자인지 파악
		System.out.println(s.startsWith("홍"));  //매개변수값이 시작하는 글자인지 파악
		System.out.println(s.endsWith("덩"));    //매개변수값이 끝나는 글자인지 파악
		
		String s3="10,20,30";
		String[] split=s3.split(",");
		for(int i=0; i<split.length; i++) {
			System.out.println(split[i]);
		}
		
		String s4="abcd"; //String은 불변객체이다. 한번 만들어지면 내부값 변경이 불가능하다.
		String s5=s4.toUpperCase();
		System.out.println(s4==s5);
		//문자열 변경 메서드 실행 결과로 새로운 문자열을 반환한다.
	}
}
