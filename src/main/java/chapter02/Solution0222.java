package chapter02;

import java.util.Scanner;

public class Solution0222 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int remainingAmount = input.nextInt();
        int numberOfOneDollars = remainingAmount / 100;
        remainingAmount = remainingAmount % 100;
        int numberOfQuarters = remainingAmount / 25;
        remainingAmount = remainingAmount % 25;
        int numberOfDimes = remainingAmount / 10;
        remainingAmount = remainingAmount % 10;
        int numberOfNickels = remainingAmount / 5;
        remainingAmount = remainingAmount % 5;
        int numberOfPennies = remainingAmount;
        System.out.println(numberOfOneDollars);
        System.out.println(numberOfQuarters);
        System.out.println(numberOfDimes);
        System.out.println(numberOfNickels);
        System.out.println(numberOfPennies);
    }
}