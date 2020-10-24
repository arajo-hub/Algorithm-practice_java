package BaekjoonOnlineJudge;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class No2741 { // class명 Main으로 수정하고 import부터 복사해서 제출할 것.

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
		int n=Integer.parseInt(reader.readLine());
		
		for (int i=1;i<=n;i++) {
			writer.write(i+"\n");
		}
		writer.flush();
		writer.close();
	}

}