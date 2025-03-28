package chapter03;

import java.util.Scanner;

public class Solution0301 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();
        double delta = Math.pow(b, 2) - 4 * a * c;
        if (delta < 0) {
            System.out.println("The equation has no real roots");
        } else if (delta == 0) {
            System.out.println(-b / (2 * a));
        } else {
            System.out.println((-b + Math.sqrt(delta)) / (2 * a));
            System.out.println((-b - Math.sqrt(delta)) / (2 * a));
        }
    }
}