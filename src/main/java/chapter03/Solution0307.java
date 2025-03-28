package chapter03;

import java.util.Scanner;

public class Solution0307 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double amount = input.nextDouble();
        int remainingAmount = (int) (amount * 100);
        int numberOfOneDollars = remainingAmount / 100;
        remainingAmount = remainingAmount % 100;
        int numberOfQuarters = remainingAmount / 25;
        remainingAmount = remainingAmount % 25;
        int numberOfDimes = remainingAmount / 10;
        remainingAmount = remainingAmount % 10;
        int numberOfNickels = remainingAmount / 5;
        remainingAmount = remainingAmount % 5;
        int numberOfPennies = remainingAmount;
        if (numberOfOneDollars > 0) {
            System.out.print(numberOfOneDollars);
            System.out.print(numberOfOneDollars == 1 ? " dollar" : " dollars");
        }
        if (numberOfQuarters > 0) {
            System.out.print(" and ");
            System.out.print(numberOfQuarters);
            System.out.print(numberOfOneDollars == 1 ? " quarter" : " quarters");
        }
        if (numberOfDimes > 0) {
            System.out.print(" and ");
            System.out.print(numberOfDimes);
            System.out.print(numberOfOneDollars == 1 ? " dim" : " dimes");
        }
        if (numberOfNickels > 0) {
            System.out.print(" and ");
            System.out.print(numberOfNickels);
            System.out.print(numberOfOneDollars == 1 ? " nickel" : " nickels");
        }
        if (numberOfPennies > 0) {
            System.out.print(" and ");
            System.out.print(numberOfPennies);
            System.out.print(numberOfOneDollars == 1 ? " penny" : " pennies");
        }
    }
}