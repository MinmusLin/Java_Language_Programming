package chapter02;

import java.util.Scanner;

public class Solution0202 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double r = sc.nextDouble();
        double h = sc.nextDouble();
        System.out.println(r * r * Math.PI);
        System.out.println(r * r * Math.PI * h);
    }
}