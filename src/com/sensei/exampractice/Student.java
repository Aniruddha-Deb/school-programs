package com.sensei.exampractice;

import java.util.Scanner;

public class Student {

    String name;
    int age;
    int m1, m2, m3;
    int maximum;
    int average;

    public Student( String n, int a, int maths, int sci, int comp, int max, int avg ) {
        name = n;
        age = a;
        m1 = maths;
        m2 = sci;
        m3 = comp;
        maximum = max;
        average = avg;
    }

    public void accept() {
        Scanner sc = new Scanner( System.in );
        System.out.println( "Enter name, age, marks in maths, science and computers." );
        name = sc.nextLine();
        age = sc.nextInt();
        m1 = sc.nextInt();
        m2 = sc.nextInt();
        m3 = sc.nextInt();
    }

    public void compute() {
        maximum = (m1>m2) ? (m1>m3)?m1:m3 : (m2>m3)?m2:m3;
        average = (m1+m2+m3)/3;
    }

    public void display() {
        System.out.println( "Name = " + name );
        System.out.println( "Age = " + age );
        System.out.println( "Marks in Maths = " + m1 );
        System.out.println( "Marks in Science = " + m2 );
        System.out.println( "Marks in Computers = " + m3 );
        System.out.println( "Maximum = " + maximum );
        System.out.println( "Average = " + average );
    }

    public static void main( String args[] ) {
        Student s = new Student( "Aniruddha", 15, 97, 95, 96, 97, 96 );
        s.accept();
        s.compute();
        s.display();
    }

}