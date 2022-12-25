package com.bridgelaz.basicprogram;
import java.util.Scanner;
public class FlipCoin {
    public static void main(String[] args) {
        int n, headcount = 0, tailcount = 0;
        double heads, tails;
        FlipCoin flip =  new FlipCoin();
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number of times you want to flip the coin : ");
        n = scan.nextInt();
        for(int i = 0; i < n; i++){
            double random = Math.random();
            if(random < 0.5)
                tailcount ++;
            else
                headcount ++;
        }
        heads = headcount / n * 100;
        System.out.println("Percentage of heads : " + heads + "%");
        tails = tailcount / n * 100;
        System.out.println("Percentage of tails : " + tails + "%");
    }
}