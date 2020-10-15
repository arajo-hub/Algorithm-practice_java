package BaekjoonOnlineJudge;

import java.util.Scanner;

public class No14681 { // class명 Main으로 수정하고 import부터 복사해서 제출할 것.

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		short year=scan.nextShort();
		if ((year%4==0 && year%100!=0) || year%400==0) {
			System.out.print(1);
		}else {
			System.out.print(0);
		}
		scan.close();
	}
}