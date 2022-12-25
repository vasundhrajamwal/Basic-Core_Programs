package com.bridgelaz.basicprogram;

import java.util.Scanner;

public class HarmonicNumber {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        double N, i;
        System.out.println("Enter N : ");
        N = scan.nextDouble();
        for(i = 1; i <=N; i++){
            if(i == 1)
                System.out.println("1/1 + ");
            else if(i == N)
                System.out.println("1/" + i + " +");
            else
                System.out.println("1/" + i + " +");
        }
    }
}
