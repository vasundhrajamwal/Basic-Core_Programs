package com.bridgelaz.basicprogram;

import java.util.Scanner;

public class LargestOfThree {
        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            int num1, num2, num3;
            System.out.println("Enter the 1st number : ");
            num1 = scan.nextInt();
            System.out.println("Enter the 2nd number : ");
            num2 = scan.nextInt();
            System.out.println("Enter the 3rd number : ");
            num3 = scan.nextInt();
            if (num1 > num2 && num1 > num3) {
                System.out.println("" + num1 + " is the greatest");
            } else if (num2 > num1 && num2 > num3) {
                System.out.println("" + num2 + " is the greatest");
            } else {
                System.out.println("" + num3 + " is the greatest");
            }
        }
    }
