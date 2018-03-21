package com.sensei.exampractice;

import java.util.Scanner;

public class Piglatin {
    
    public static void main( String args[] ) {
        Scanner sc = new Scanner( System.in );
        System.out.println( "Enter a word" );
        String in = sc.nextLine().toUpperCase();
        String v;
        for( int i=0; i<in.length(); i++ ) {
            char ch = in.charAt(i);
            if( ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U' ) {
                v = in.substring( 0, i );
                in = in.substring( i ) + v + "AY";
                break;
            }
        }

        System.out.println( in );
    }
}