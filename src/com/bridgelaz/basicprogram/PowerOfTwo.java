package com.bridgelaz.basicprogram;

import java.util.Scanner;

public class PowerOfTwo {
public static void main(String[] args){
    int mul = 1;
    Scanner scan = new Scanner(System.in);
    System.out.println("Enter the value : ");
    int num = scan.nextInt();
    if(num > 31){
        System.out.println("Value of the number should be less than 31");
    }
    else{
        for(int i = 1; i <=num; i++){
            mul = mul * 2;
            System.out.println(mul);
        }
    }
}
}