package com.sensei.exampractice;

public class GeneratePrime {
	
    int n;

    GeneratePrime( int x ) {
        n = x;
    }

    boolean isPrime( int x ) {
        int sum = 0;
        for( int i=1; i<=x; i++ ) {
            if( x%i == 0 ) {
                sum++;
            }
        }

        if( sum == 2 ) {
            return true;
        }
        return false;
    }

    void display() {
        int numPrimes = 0;
        int i=2;
        while( numPrimes < n ) {
            if( isPrime( i ) ) {
                System.out.println( i );
                numPrimes++;
            }
            i++;
        }
    }

    public static void main( String args[] ) {
        GeneratePrime t = new GeneratePrime(25);
        t.display();
    }
}
