package chapter02;

import java.util.Scanner;

public class Solution0213 {
    public static void main(String[] args) {
        double total = 0;
        Scanner sc = new Scanner(System.in);
        double amount = sc.nextDouble();
        for (int i = 0; i < 6; i++) {
            total = (amount + total) * 1.00417;
        }
        System.out.print((int) (total * 100) / 100.0);
    }
}