package BaekjoonOnlineJudge;

import java.util.Scanner;

public class No11021 { // class명 Main으로 수정하고 import부터 복사해서 제출할 것.

    Scanner scan=new Scanner(System.in);
    
    int n=scan.nextInt();
    int[] array=new int[n];
    int[] dp=new int[n];
    
    for (int h=0;h<n;h++) {
        array[h]=scan.nextInt();
    }
    
    for (int i=0; i<n; i++) {
        
        for (int j=0;j<i;j++) {
            
            if (array[i]>array[j] && dp[i]<dp[j]) {
                
                dp[i]=dp[j];
            
            }
            
        }
        
        dp[i]=dp[i]+1;
    }
    
    int result=0;
    for (int num:dp) {
        result=Math.max(result, num);
    }
    
    System.out.println(result);

}
