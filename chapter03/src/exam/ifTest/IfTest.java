package exam.ifTest;

import java.util.Scanner;

public class IfTest {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int count=0;
		while(count<=4) {

			int com = (int) (Math.random()*6+1);
			System.out.println(com);
			int player = scan.nextInt();

			if(player>=1 && player <=6)  {
				if(com==player)  {
					System.out.println( "정답");
					count=++count;
				}else  {
					System.out.println( "다음 기회를");
				}
			}else {
				System.out.println("숫자범위를 벗어났습니다.");
			}
		}
		System.out.println( count +"번 맞췄습니다");
	}
}

