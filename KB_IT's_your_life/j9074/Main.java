package J9074;


import java.util.Scanner;
import java.util.StringTokenizer;

/**
 * 문제
1부터 10까지의 정수를 입력받다가 입력된 정수가 범위를 벗어나면 그 때까지 1번 이상 입력된 각 숫자의 개수를 작은 수부터 출력하는 프로그램을 작성하시오.
: 줄바꿈,  : 공백
예제
5 6 10 9 3 5 3 5 0
3 : 2개
5 : 3개
6 : 1개
9 : 1개
10 : 1개
 **/
public class Main {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		//문자열 나누기 기능 : StringTokenizer
		String line=sc.nextLine(); //한줄 읽기
		//숫자갯수 알아내기 위해서 StringTokenizer
		StringTokenizer st=new StringTokenizer(line);
		int count=st.countTokens();
		//추출한 토큰이 존재하는 동안 반복
		
		int[] cnt=new int[11];
		
		while(st.hasMoreTokens()) {
			String s=st.nextToken();		
			//String -> int 변환
			int i=Integer.parseInt(s);
			if(i<1 || i>10) {
				break;
			}
			cnt[i]+=1;
		}
		for(int i=0; i<cnt.length; i++)
		{
			if(cnt[i] != 0) {
				System.out.println(i+" : "+ cnt[i]+"개");
			}
		}
		sc.close();
	}
}
