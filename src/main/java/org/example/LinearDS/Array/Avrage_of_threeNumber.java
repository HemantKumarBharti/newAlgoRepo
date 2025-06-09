package org.example.LinearDS.Array;

import java.util.Scanner;

public class Avrage_of_threeNumber {
    public static void main(String[] args) {
        int count;
        int number=0;
        int sum=0;
        float avg=0;
        Scanner scanner = new Scanner(System.in);
        count=scanner.nextInt();
        for (int i=0;i<count;i++){
            number =scanner.nextInt();
            sum=sum+number;
        }
        avg=sum/count;
        System.out.println(avg);
    }
}
