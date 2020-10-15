package BaekjoonOnlineJudge;

import java.util.Scanner;

public class No2753 { // class명 Main으로 수정하고 import부터 복사해서 제출할 것.

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		short x=scan.nextShort();
		short y=scan.nextShort();
		if (x>0 && y>0){
			System.out.print(1);
		}else if (x>0 && y<0) {
			System.out.print(4);
		}else if (x<0 && y>0) {
			System.out.print(2);
		}else {
			System.out.print(3);
		}
		scan.close();
	}
}