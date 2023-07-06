package day_04;

import java.util.Arrays;

public class CompareExam {
	public static void main(String[] args) {
		MyMember[] mems = new MyMember[3]; //mems는 MyMember의 배열타입을 가리킨다.
		int count = 0; //객체를 저장할 위치 -> 저장갯수를 의미한다.
		//회원등록(Create)
		mems[count++]=new MyMember("홍길동",33);
		mems[count++]=new MyMember("김길동",35);
		mems[count++]=new MyMember("박길동",30);
		
		Arrays.sort(mems);
		
		for(int i=0; i<count; i++) {
			System.out.println(mems[i]);
		}
	}
}
