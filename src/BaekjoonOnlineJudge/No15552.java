package BaekjoonOnlineJudge;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class No15552 { // class명 Main으로 수정하고 import부터 복사해서 제출할 것.

	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
		
		// 내가 짠 코드
//		String t=reader.readLine();
//		int tc=Integer.parseInt(t);
//		
//		for(int i=0; i<tc;i++) {
//			String[] ab=reader.readLine().split(" ");
//			int newA=Integer.parseInt(ab[0]);
//			int newB=Integer.parseInt(ab[1]);
//			
//			writer.write(newA+newB+"\n");
//		}
//		reader.close();
//		writer.flush();
//		writer.close();
		
		// 다른 사람 코드 참고하여 수정한 코드
		int tc=Integer.parseInt(reader.readLine());
		
		StringTokenizer st;
		// 긴 문자열을 지정된 구분자를 기준으로 문자열을 슬라이싱하는 데 사용된다.
		// 복잡한 구분자를 이용해야 할 때는 Scanner나 split()을 사용해야 한다.
		
		for(int i=1;i<=tc;i++) {
			st=new StringTokenizer(reader.readLine(), " ");
			
			int a=Integer.parseInt(st.nextToken());
			int b=Integer.parseInt(st.nextToken());
			
			writer.write(a+b+"\n");
		}
		
		reader.close();
		writer.flush();
		writer.close();
		
	}

}
