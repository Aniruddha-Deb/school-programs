package org.tbs.Class9.Term3.Terminals;

import java.io.*;

public class Question9 {

	public static void main(String[] args)throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int in[] = new int[10];
		System.out.println("enter 10 nos");
		
		for(int i = 0;i < 10;i++){
			in[i] = Integer.parseInt(br.readLine());
		}
		
		int oddSum = 0;
		
		for(int i = 1;i < 10;i+=2){
			
			oddSum = oddSum + in[i];
		}
		
		System.out.println("sum of odd subscripted  values = " + oddSum);
				
	}

}
