package BaekjoonOnlineJudge;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;
public class No10818 { // class명 Main으로 수정하고 import부터 복사해서 제출할 것.

	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int n=Integer.parseInt(reader.readLine());
		int[] numList=new int[n];
		int index=0;
		StringTokenizer st=new StringTokenizer(reader.readLine(), " ");
		while(st.hasMoreTokens()) {
			numList[index]=Integer.parseInt(st.nextToken());
			index++;
			
			
		}
		Arrays.sort(numList);
		writer.write(numList[0]+" "+numList[n-1]);
		writer.flush();
		writer.close();
		reader.close();
	}
}
