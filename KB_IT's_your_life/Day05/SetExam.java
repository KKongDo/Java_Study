package day_05;

import java.util.HashSet;
import java.util.Set;

public class SetExam {
	public static void main(String[] args) {
		Set<String> hs=new HashSet<String>();
		
		박태환선수 bt=new 박태환선수();
		
		수영선수 s1;
		s1=bt;
		야구선수 b1;
		b1=bt;
		
		s1.swimming(); // 공던지기 기능이 없음.
		b1.공던지기(); //swimming 기능이 없음.
		//이러한 이유는 변수의 타입에 있는 메서드만 호출할 수 있기 때문이다.
		
		bt.swimming();
		bt.공던지기();
	}
}


interface 수영선수{
	public void swimming();
	
}
interface 야구선수{
	public void 공던지기();
}

class 박태환선수 implements 수영선수, 야구선수{

	@Override
	public void swimming() {
		System.out.println("수영하기");
	}

	@Override
	public void 공던지기() {
		System.out.println("공던지기");
	}
}
