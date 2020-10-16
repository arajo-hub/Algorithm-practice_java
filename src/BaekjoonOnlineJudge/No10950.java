package BaekjoonOnlineJudge;

import java.util.Scanner;

public class No10950 { // class명 Main으로 수정하고 import부터 복사해서 제출할 것.

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		byte t=scan.nextByte();
		
		for (int i=1;i<t+1;i++) {
			byte a=scan.nextByte();
			byte b=scan.nextByte();
			System.out.println(a+b);
		}
		scan.close();
	}

}
