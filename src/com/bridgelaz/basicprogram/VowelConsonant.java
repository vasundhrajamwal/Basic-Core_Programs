package com.bridgelaz.basicprogram;

import java.util.Scanner;

public class VowelConsonant {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        char ch;
        System.out.println("Enter the alphabet : ");
        ch = scan.next().charAt(0);
        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
            System.out.println(ch + " is a vowel");
        else
            System.out.println(ch + " is a consonant");
    }
}
