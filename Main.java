package day02_practice;

import java.util.Scanner;

//정사각형 n*n에 알파벳 넣기

public class Main {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int num=sc.nextInt();
		char[][] square=new char[num][num];
		char ch='A';
		
		for(int i=0; i<num; i++) {
			for(int j=0; j<num; j++) {
				if(i%2==0) {
					square[j][i]=ch++;
				}
				else {
					square[num-1-j][i]=ch++;
				}
				if(ch>'Z')
					ch='A';
			}
		}
		
		for(int i=0; i<num; i++) {
			for(int j=0; j<num; j++) {
				System.out.print(square[i][j]+" ");
			}
			System.out.println(" ");
		}
		sc.close();
	}
}