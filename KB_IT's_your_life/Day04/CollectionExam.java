package day_04;

import java.util.ArrayList;
import java.util.HashSet;


//* 오늘 수업하는 내용.
//- Manager/Service클래스 작성
//- 상속,추상,인터페이스,다형성
//컬렉션 API
//Comparable Comparator등 
//
//* 클래스 종류
// 1. VO	- 데이터 저장용 , 모델 클래스
// 2. Manager/Service - VO의 CRUD용
// 3. UI 
// 4. IO
// 
// 코드의 단순 모음 = 라이브러리
// 정해진 흐름에 사용자가 만든 소프트웨어를 끼워넣는 것 = 프레임워크


public class CollectionExam {
	public static void main(String[] args) {
		//로또번호 생성기
		//List타입
		ArrayList<Integer> lottoList=new ArrayList<Integer>();
		HashSet<Integer> lottoSet=new HashSet<Integer>();
		
		for(int i=0; i<6; i++) {
			int r=(int)(Math.random()*45+1);
			lottoSet.add(r);
//			if(lottoList.contains(r))
//				continue;
			lottoList.add(r);
		}
		
		System.out.println(lottoList);
		System.out.println(lottoSet);
		System.out.println(lottoList.get(0));
		System.out.println(lottoList.size());
		System.out.println(lottoSet.size());
	}
}
