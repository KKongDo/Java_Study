package day_05;

public class StringExam3 {
	public static void main(String[] args) {
		//StringBuilder : 고속 문자열 처리 객체
		String s="0123456789";
		String s2="";
		
		//실행시간
		long start = System.currentTimeMillis();
		for (int i = 0; i < 10000; i++) {
			s2=s2+s; //수행할때마다 새로운 객체가 발생하여 새로운 메모리를 사용한다.
		}
		System.out.println(s2);
		long end = System.currentTimeMillis();
		System.out.println("실행시간1 : "+(end-start));
		//////////
		
		StringBuffer ssb=new StringBuffer(); // 여러사람이 써야하는 경우
		 
		StringBuilder sb=new StringBuilder(); //혼자 써야하는 경우
		long start2 = System.currentTimeMillis();
		for (int i = 0; i < 10000; i++) {
			sb.append(s);
		}
		sb.toString();
		long end2 = System.currentTimeMillis();
		System.out.println("실행시간2 : "+(end2-start2));
	}
}
