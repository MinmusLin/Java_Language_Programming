package chapter02;

import java.util.Scanner;

public class Solution0210 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double m = sc.nextDouble();
        double n0 = sc.nextDouble();
        double n1 = sc.nextDouble();
        System.out.println(m * (n1 - n0) * 4184);
    }
}