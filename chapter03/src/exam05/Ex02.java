package exam05;

import java.util.Scanner;

public class Ex02 {
	public static void main(String[] args) {
		int jumsu[ ] = new int [10];

		Scanner scan = new Scanner(System.in);

		for(int i = 0; i < jumsu . length; i++)  {
			System.out.println(i+1+"번째 학생 점수");

			jumsu[i] =scan.nextInt();
		}
		int sum=0;
		for(int i =0;i<jumsu.length;i++) {
			sum=sum+jumsu[i];
			
		}
		System.out.println("점수의 합은"+sum);
		System.out.println("점수의 평균은"+(double)sum/jumsu.length);
		System.out.println(junsu[10]);
	}
}
