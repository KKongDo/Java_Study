package day_05;

import java.util.Arrays;

public class CompareExam {
	public static void main(String[] args) {
		MyMember[] mems = new MyMember[4]; 
		int count = 0; 
		
		mems[count++]=new MyMember("홍길동",33);
		mems[count++]=new MyMember("김길동",35);
		mems[count++]=new MyMember("박길동",30);
		mems[count++]=new MyMember("홍길동",33);
		//배열 정렬은 Arrays.sort(배열)를 한다.
		//Arrays.sort(mems);
		Arrays.sort(mems, new NameComparator()); // Comparator쓴것
		
		//Comparable은 오름차순밖에 안된다. 비교대상
		//Comparator는 비교기. 외부 비교기를 만드는 것
		System.out.println("** 정렬후 ***");
		for(int i=0; i<count; i++) {
			System.out.println(mems[i]);
		}
		//
		System.out.println("mems[0] == mems[1] " + (mems[0]==mems[1]));
		System.out.println("mems[0].equals(mems[1]) " + (mems[0].equals(mems[1])));
	}
}
