package BaekjoonOnlineJudge;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class No10871 {

	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st=new StringTokenizer(reader.readLine());
		int n=Integer.parseInt(st.nextToken());
		int x=Integer.parseInt(st.nextToken());
		
		StringTokenizer num=new StringTokenizer(reader.readLine());
		for (int i=0;i<n;i++) {
			int each=Integer.parseInt(num.nextToken());
			if (each<x) {
				writer.write(each+" ");
			}
		}
		writer.flush();
		writer.close();
		reader.close();
	}

}
