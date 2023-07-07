package day_05;

import java.util.ArrayList;

public class WrapExam {
	public static void main(String[] args) {
		int i=5;
		Integer ii=i; //컴파일러가 new Integer(i)해서 넣어줌. 박싱(Boxing) 기본타입 -> 객체
		String ss=ii.toString(); //int타입을 String으로 변환.
		String ss2="200";
		int k=Integer.parseInt(ss2);
		
		int j=ii; // 언박싱 : 객체->기본타입
		
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(i);
	}
}
