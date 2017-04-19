package com.sensei.java.arrays;

//Using binary search, print the position of a value in an arranged list of 5 integers.
//Assume that the entered list is in ascending.
import java .io.*;
public class BinarySearch {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int in[] = new int[5];
		System.out.println("Enter 5 nos. in ascending order : ");
		for ( int i = 0; i < 5 ; i++)
			in[i] = Integer.parseInt(br.readLine());
		System.out.println("Enter the number to be searched : ");
		int check = Integer.parseInt(br.readLine());
		int l = 0;
		int u = 4;
		int mid;
		boolean flag = false;
		do{
			
			mid = ( l + u ) / 2;
			if( check == mid ){
				
				System.out.println("Search Element is " + check );
				System.out.println("Element found at index " + mid);
				System.out.println("Position of the element in the array is " + ( mid + 1 ));
				flag = true;
				break;
				
			}
			
			else if(check < in[mid])
				u = mid - 1;
			
			else
				l = mid + 1;
			
		}while(l<=u);
		
		if( flag == false )
			System.out.println("Error 404! Search element not found!");
		
	}

}
