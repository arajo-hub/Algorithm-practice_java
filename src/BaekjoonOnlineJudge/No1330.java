package BaekjoonOnlineJudge;

import java.util.Scanner;

public class No1330 { // class명 Main으로 수정하고 import부터 복사해서 제출할 것.

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int a=scan.nextInt();
		int b=scan.nextInt();
		
		if (a==b) {
			System.out.print("==");
		}else {
			if(a<b) {
				System.out.print("<");
			}else {
				System.out.print(">");
			}
		}
		scan.close();

	}

}
