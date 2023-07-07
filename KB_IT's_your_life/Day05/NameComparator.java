package day_05;

import java.util.Comparator;

/** 이름기준 정렬기 */
public class NameComparator implements Comparator<MyMember>{

	@Override
	public int compare(MyMember o1, MyMember o2) { // 무조건 앞-뒤
		//return o1.getAge()-o2.getAge(); //나이기준 순차정렬(작은거부터)
		//return o2.getAge()-o1.getAge(); //나이기준 역순정렬(큰거부터)
		
		return o1.getName().compareTo(o2.getName()); //"홍길동".compareTo("박길동");, 순차정렬
	}
}
