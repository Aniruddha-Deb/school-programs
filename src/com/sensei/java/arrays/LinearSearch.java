package com.sensei.java.arrays;

//Accept a list of 10 nos. and search for a value in the list.
//Print the position of the search element

import java.io.*;
public class LinearSearch {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader( new InputStreamReader (System.in) );
		int arr[] = new int[10];
		System.out.println("Enter 10 nos. : ");
		for( int i = 0; i< 10; i++ )
			arr[i] = Integer.parseInt(br.readLine());
		int x = arr.length;
		System.out.println("enter search element");
		int a = Integer.parseInt(br.readLine());
		int pos =0;
		for( int i = 0; i <= (x-1); i++ ){
			
			if( arr[i] == a )
				pos =i + 1;
		
		}
		
		if( pos > 0)
			System.out.println("Position of search element : " + pos );
		else
			System.out.println("Error 404! Search element not found!" );

	}

}
