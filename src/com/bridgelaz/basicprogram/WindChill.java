package com.bridgelaz.basicprogram;

import java.util.Scanner;

public class WindChill {
public static void main(String[] args){
    double t, v;
    Scanner scan = new Scanner(System.in);
    System.out.println("Enter the Temperature : ");
    t = scan.nextDouble();
    System.out.println("Enter the wind speed : ");
    v = scan.nextDouble();
    double windChill;
    windChill = 35.74 + 0.6215 + (0.4275 * t - 35.75) * Math.pow(v , 0.16);
    System.out.println("National Weather Service : " + windChill);
}
}
