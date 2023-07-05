package 숫자맞추기게임;

import java.util.Scanner;
/**
 * 1. 컴퓨터가 1~100 사이의 임의의 정수를 하나 저장
 * 2. 1~100 숫자를 입력하세요 출력
 * 3. 사용자는 1~100 사이 임의의 숫자를 입력
 * 4. 사용자 입력 숫자가 컴퓨터 숫자와 같으면 정답 출력
 * 5. 사용자 입력 숫자가 컴퓨터 숫자보다 크면 내려주세요 출력 
 * 6. 사용자 입력 숫자가 컴퓨터 숫자보다 작으면 올려주세요 출력
 * 7. 사용자가 정답을 입력할 때 까지 2부터 반복
 */

public class Main {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int num=(int)(Math.random()*100)+1;
		while(true) {
			System.out.println("1~100 사이 숫자를 입력하세요.");
			int input=sc.nextInt();
			if(num==input) {
				System.out.println("정답");
				break;
			}
			else if(num>input)
				System.out.println("올려주세요");
			else
				System.out.println("내려주세요");
		}
		sc.close();
	}
}