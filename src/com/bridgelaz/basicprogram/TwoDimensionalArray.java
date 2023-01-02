package com.bridgelaz.basicprogram;

import java.util.Scanner;

public class TwoDimensionalArray {
    public static void main(String[] args){
        int M, N;
        // Here M = rows and N = Columns
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number of rows, M : ");
        M =  scan.nextInt();
        System.out.println("Enter the number of columns, N : ");
        N = scan.nextInt();
        int[][] arr = new int[M][N];
        for(int i = 0; i < M; i++){
            for(int j = 0; j < N; j++){
                System.out.println("Enter input for position (" + i + " ," + j + ")");
                arr[i][j] = scan.nextInt();
            }
        }
        for(int i = 0; i < M; i++){
            for(int j = 0; j < N; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
