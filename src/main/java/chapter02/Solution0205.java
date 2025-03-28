package chapter02;

import java.util.Scanner;

public class Solution0205 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a = sc.nextInt();
        double b = sc.nextInt();
        System.out.println(a * b / 100);
        System.out.println(a * b / 100 + a);
    }
}