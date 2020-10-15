package BaekjoonOnlineJudge;

import java.util.Scanner;

public class No2884 { // class명 Main으로 수정하고 import부터 복사해서 제출할 것.

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		short h=scan.nextShort();
		short m=scan.nextShort();
		if (m<45) {
			if (h==0) {
				h=24;
			}
			System.out.printf("%d %d", h-1, 15+m);
		}else {
			System.out.printf("%d %d", h, m-45);
		}
		scan.close();
	}
}