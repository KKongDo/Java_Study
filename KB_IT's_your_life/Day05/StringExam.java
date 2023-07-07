package day_05;

public class StringExam {
	public static void main(String[] args) {
		System.out.println("홍길동".compareTo("박길동")); //음수가 나오면 순서가 앞이고, 양수가 나오면 순서가 뒤에 나오는 걸 알 수 있다. 
		//String 비교
		String s1= "abc"; //"abc"는 스트링 상수, 그러므로 메서드영역에 들어가있다.
		String s2="abc";  //"abc"는 스트링 상수, 그러므로 메서드영역에 들어가있다.
		//둘다 같은 "abc"를 가리킨다.
		
		String s3=new String("abc"); // new 연산자이기 때문에 "abc"는 힙영역에 들어간다.
		String s4=new String("abc"); // new 연산자이기 때문에 "abc"는 힙영역에 들어간다.
		//"abc"가 둘다 같다.
		
		
		System.out.println("s1=s2 "+(s1==s2)); //주소값 비교
		System.out.println("s3==s4 "+(s3==s4)); //주소값 비교
		
		//실제 내부 문자열 비교를 하기 위하여는 equals메서드를 사용한다. 주소를 비교하는 것이 아니다.
		System.out.println("s3.equals(s4) " + s3.equals(s4));
		System.out.println("s1.equals(s4) " + s1.equals(s4)); //객체의 내부값 비교용으로 사용하는 메서든 주소값을 비교한느 것이 아니다.
	}
}
