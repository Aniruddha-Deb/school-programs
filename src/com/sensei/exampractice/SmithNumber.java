package com.sensei.exampractice;

import java.util.Scanner;

public class SmithNumber {
    
    public static void main( String args[] ) {
        Scanner sc = new Scanner( System.in );
        System.out.println( "Enter a number" );
        
        int input = sc.nextInt();
        int sumOfInputDigits = sumOfDigits( input );

        int sumPrimeFactors = 0;
        int nextPrimeNumber = 2;
        
        int quotient = input ;
        while( quotient > 1 && nextPrimeNumber <= quotient ) {
        	
        	// If the next prime number is a factor of the quotient
            if( quotient % nextPrimeNumber == 0 ) {
            	// Accumulate the sum of digits of the prime factor
                sumPrimeFactors += sumOfDigits(nextPrimeNumber);
                
                // Find the new quotient
                quotient /= nextPrimeNumber;
            }
            else {
            	// If the current prime is not a factor, we find the next
            	// prime number less than the quotient
                while( nextPrimeNumber <= quotient ) {
                    nextPrimeNumber++;
                    if( isPrime( nextPrimeNumber ) ) break;
                }
            }
        }

        if( sumPrimeFactors == sumOfInputDigits ) {
            System.out.println( "Number is a smith number" );
        }
        else {
            System.out.println( "Number is not a smith number" );
        }
    }

    public static int sumOfDigits( int n ) {
        int sum=0, d;
        while( n > 0 ) {
            d = n%10;
            sum += d;
            n = n/10;
        }
        return sum;
    }

    public static boolean isPrime( int n ) {
        int factors = 0;
        for( int i=1; i<=n; i++ ) {
            if( n%i == 0 ) {
                factors++;
            }
        }
        if( factors == 2 ) return true;
        return false;
    }
}