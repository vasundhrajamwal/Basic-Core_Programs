package com.bridgelaz.basicprogram;

import java.util.Scanner;

public class OddEvenNumber {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int num;
        System.out.println("Enter Number to be check : ");
        num = scan.nextInt();
        if (num % 2 == 0 )
            System.out.println(num + " is an even number");
        else
            System.out.println(num + " is an odd number");
    }
}
