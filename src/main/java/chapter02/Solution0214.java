package chapter02;

import java.util.Scanner;

public class Solution0214 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double w = sc.nextDouble();
        double h = sc.nextDouble();
        System.out.println(w * 0.45359237 / Math.pow(h * 0.0254, 2));
    }
}