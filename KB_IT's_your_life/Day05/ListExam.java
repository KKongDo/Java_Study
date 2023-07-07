package day_05;

import java.util.ArrayList;

public class ListExam {
	public static void main(String[] args) {
		//회원이름 관리
		ArrayList<String> names=new ArrayList<String>();
		names.add("홍길동");
		names.add("김길동");
		names.add("박길동");
		System.out.println(names);
		names.add(1,"박길동");
		System.out.println(names);
		String r = names.remove(2); // remove()메서드는 지운값이 반환된다.
		System.out.println(names);
		System.out.println(r);
		names.clear();
		System.out.println(names);
	}
}
