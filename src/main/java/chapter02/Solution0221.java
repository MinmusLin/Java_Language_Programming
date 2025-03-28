package chapter02;

import java.util.Scanner;

public class Solution0221 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();
        System.out.println(a * Math.pow(1 + b / 100 / 12, 12 * c));
    }
}