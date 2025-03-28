package chapter02;

import java.util.Scanner;

public class Solution0209 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double v0 = sc.nextDouble();
        double v1 = sc.nextDouble();
        double t = sc.nextDouble();
        System.out.println((v1 - v0) / t);
    }
}