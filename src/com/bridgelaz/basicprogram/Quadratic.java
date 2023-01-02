package com.bridgelaz.basicprogram;

import java.util.Scanner;

public class Quadratic {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int a, b, c;
        System.out.println("Enter the value of a : ");
        a = scan.nextInt();
        System.out.println("Enter the value of b : ");
        b = scan.nextInt();
        System.out.println("Enter the value of c : ");
        c = scan.nextInt();
        System.out.println("Quadratic Equation is : " + a + " x * x + " + b + " * x + " + c);
        int delta = b * b - 4 * a * c;
        float root1 = (float) ((-b + Math.sqrt((delta)) / (2 * a)));
        float root2 = (float) ((-b - Math.sqrt((delta)) / (2 * a)));
        System.out.println("Roots of the Quadratic Equation are  , Root1 = " + root1 + " Root2 = " + root2);
    }
}