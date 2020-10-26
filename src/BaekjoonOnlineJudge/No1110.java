package BaekjoonOnlineJudge;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
public class No1110 { // class명 Main으로 수정하고 import부터 복사해서 제출할 것.

	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
		int num=Integer.parseInt(reader.readLine()); // 26 입력
		int cycle=1;
		int result=num;
		int tail=0;
		while(true) {
			tail=result%10*10;
			result=result/10+result%10; // 2+6=8 -> 8이 num이 되어야 함
			result=result%10+tail;
			if (num==result) {
				writer.write(cycle+"");
				break;
			}else {
				cycle+=1;
			}
		}
		writer.flush();
		writer.close();
		reader.close();
	}
}
