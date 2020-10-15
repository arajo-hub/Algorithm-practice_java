package BaekjoonOnlineJudge;

import java.util.Scanner;

public class No9498 { // class명 Main으로 수정하고 import부터 복사해서 제출할 것.

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		byte score=scan.nextByte();
		if (score<60) {
			System.out.println("F");
		}else if (score<70) {
			System.out.println("D");
		}else if (score<80) {
			System.out.println("C");
		}else if (score<90) {
			System.out.println("B");
		}else if (score<101) {
			System.out.println("A");
		}
		scan.close();

	}

}
