package BaekjoonOnlineJudge;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class No2439 { // class명 Main으로 수정하고 import부터 복사해서 제출할 것.

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
		int n=Integer.parseInt(reader.readLine());
		
		for (int i=1;i<=n;i++) {
			for (int j=1;j<=i;j++) {
			writer.write("*");
			}
			writer.write("\n");
		}
		writer.flush();
		writer.close();
	}

}
