package com.sensei.exampractice;

import java.util.Scanner;

public class Test {

    public static void main( String args[] ) {
        Scanner sc = new Scanner( System.in );
        System.out.println( "Enter a word " );
        String s = sc.next();

        char[] c = new char[s.length()];
        for( int i=0; i<s.length(); i++ ) {
            c[i] = s.charAt(i);
        }

        for( int i=0; i<c.length; i++ ) {
            for( int j=0; j<c.length-1; j++ ) {
                if( c[j] > c[j+1] ) {
                    char temp = c[j];
                    c[j] = c[j+1];
                    c[j+1] = temp;
                }
            }
        }

        for( int i=0; i<c.length; i++ ) {
            System.out.print( c[i] );
        }

    }
}