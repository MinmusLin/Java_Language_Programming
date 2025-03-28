package chapter03;

import java.util.Scanner;

public class Solution0303 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();
        double d = sc.nextDouble();
        double e = sc.nextDouble();
        double f = sc.nextDouble();
        if (a * d == b * c) {
            System.out.println("The equation has no solution");
            return;
        }
        double x = (e * d - b * f) / (a * d - b * c);
        double y = (a * f - e * c) / (a * d - b * c);
        System.out.println(x);
        System.out.println(y);
    }
}