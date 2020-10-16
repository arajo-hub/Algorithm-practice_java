package BaekjoonOnlineJudge;

import java.util.Scanner;

public class No2739 { // class명 Main으로 수정하고 import부터 복사해서 제출할 것.

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		byte dan=scan.nextByte();
		scan.close();
		
		for (int i=1;i<10;i++) {
			System.out.printf("%d * %d = %d\n", dan, i, dan*i);
		}

	}

}
