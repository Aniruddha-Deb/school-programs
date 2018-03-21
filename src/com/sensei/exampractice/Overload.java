package com.sensei.exampractice;

import java.util.Scanner;

public class Overload {
    
    public static void main( String args[] ) {
        Scanner sc = new Scanner( System.in );
        System.out.println( "Enter 1 to generate the terms of fibonacci series" );
        System.out.println( "Enter 2 to find the sum of digits " );
        int n = sc.nextInt();

        switch( n ) {
            case 1:
            int n1 = 0, n2 = 1;
            System.out.println( n1 );
            System.out.println( n2 );
            for( int i=0; i<8; i++ ) {
                System.out.println( n1+n2 );
                int temp = n1;
                n1 = n2;
                n2 = temp+n2;
            }
            break;

            case 2:
            System.out.println( "Enter a number" );
            int x = sc.nextInt();
            int sum=0, d;
            while( x > 0 ) {
                d = x%10;
                sum += d;
                x /= 10;
            }
            System.out.println( "Sum = " + sum );
            break;

            default:
            System.out.println( "Incorrect option entered." );
        }
    }
}