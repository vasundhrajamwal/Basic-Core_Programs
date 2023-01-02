package com.bridgelaz.basicprogram;
import java.util.Scanner;
public class Distance {
    public static void main(String[] args){
        int x, y;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the value for x : ");
        x = scan.nextInt();
        System.out.println("Enter the value of y : ");
        y = scan.nextInt();
        System.out.println(x + " " + y);
        double distance = Math.sqrt(x * x + y * y);
        System.out.println("Distance of the line from (" + x + "," + y + ") to origin (0,0) is : " + distance) ;
    }
}
