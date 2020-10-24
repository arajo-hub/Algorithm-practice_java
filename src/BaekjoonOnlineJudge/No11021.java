package BaekjoonOnlineJudge;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class No11021 { // class명 Main으로 수정하고 import부터 복사해서 제출할 것.

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
		int t=Integer.parseInt(reader.readLine());
		
		int x=0;
		int y=0;
		for (int i=1;i<=t;i++) {
			StringTokenizer st=new StringTokenizer(reader.readLine(), " ");
			x=Integer.parseInt(st.nextToken());
			y=Integer.parseInt(st.nextToken());
			int sum=x+y;
			writer.write("Case #"+i+": "+sum+"\n");
		}
		writer.flush();
		writer.close();
	}

}
