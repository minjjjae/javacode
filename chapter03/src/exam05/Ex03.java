package exam05;

import java.util.Scanner;

public class Ex03 {
	public static void main(String[] args) {
		int student[][] = new int[10][3];
		for (int i = 0; i < student.length; i++) {
			Scanner scan = new Scanner(System.in);
			System.out.println(i+1+"번 학생 성적입력(국어 영어 수학)");
			student[i][0] = scan.nextInt();
			student[i][1] = scan.nextInt();
			student[i][2] = scan.nextInt();

		}
		break;
		for (int i = 0; i < student.length; i++) {
			int sum =0;
			int total = student[i][0]+student[i][1]+student[i][2];
		}
	}
}
