package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int a,b,c=0;
        Scanner br=new Scanner(System.in);
        System.out.println("Enter the two numbers");
        a=br.nextInt();
        b=br.nextInt();
        c=a+b;
        System.out.println("Result="+c);
    }
}
