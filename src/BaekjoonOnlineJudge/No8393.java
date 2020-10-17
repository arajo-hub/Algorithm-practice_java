package BaekjoonOnlineJudge;

import java.util.Scanner;

public class No8393 { // class명 Main으로 수정하고 import부터 복사해서 제출할 것.

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		scan.close();
		
		// 수학적 계산을 이용하는 방법
		// n이 짝수라면 합계는 (n+1)*(n/2)
		// n이 홀수라면 합계는 (n+1)*(n/2)+n/2+1
		
		int result=0;
		
		if (n%2==0){ // n이 짝수라면
			result=(1+n)*(n/2);
		}else { // n이 홀수라
			result=(1+n)*(n/2)+n/2+1;
		}
		
		System.out.println(result);
		
		// for문을 이용하는 방법
//		for(int i=1;i<=n;i++) {
//			result+=i;
//		}
//		System.out.println(result);
	}

}
