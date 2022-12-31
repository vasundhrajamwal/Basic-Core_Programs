package com.bridgelaz.basicprogram;

import java.util.Scanner;

public class QuotientRemainder {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int dividend, divisor;
        System.out.println("Enter the value for dividend : ");
        dividend = scan.nextInt();
        System.out.println("Enter the value for divisor : ");
        divisor = scan.nextInt();
        int quotient = dividend / divisor;
        System.out.println("Quotient = " + quotient);
        int remainder = dividend % divisor;
        System.out.println("Remainder = " + remainder);
    }
}
