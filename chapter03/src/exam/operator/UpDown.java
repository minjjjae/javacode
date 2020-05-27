package exam.operator;

import java.util.Scanner;

public class UpDown {
	public static void main(String[] args) {
		int com = (int) (Math.random()*50);
		System.out.println("게임을 시작합니다.");
		System.out.println("숫자를 입력해주세요.=> ");
		Scanner scan = new Scanner(System.in);
		int player=0;
		while(!(com==player)) {
			player = scan.nextInt();

			if(com>player) {
				System.out.println("up 다시 입력해보세요");

			}else if (com ==player)
			{
				System.out.println("정답");
				System.out.println("축하합니다!!*^^*");
			} else if(com<player) {
				System.out.println("down 다시 입력해보세요");
			}
		}
	}
}
