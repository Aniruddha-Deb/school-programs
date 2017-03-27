package org.tbs.Class9.Term3.Terminals;

import java.io.*;

public class Question7 {

	public static void main(String[] args)throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int in[] = new int[10];
		System.out.println("enter 10 nos");
		
		for(int i = 0;i<10;i++){
			in[i] = Integer.parseInt(br.readLine());
		}
		
		for(int i = 0;i < 10;i++){
			
			for(int j = 0;j < 9;j++){
				
				if(in[j+1]<in[j]){
					int buffer = in[j];
					in[j] = in[j+1];
					in[j+1] = buffer;
				}
				
			}
		}
		System.out.println();
		
		for(int i = 0;i < 10;i++){
			System.out.println(in[i]);
		}
	}

}
