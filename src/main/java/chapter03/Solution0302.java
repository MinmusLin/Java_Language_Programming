package chapter03;

import java.util.Scanner;

public class Solution0302 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = (int) (Math.random() * 10);
        int b = (int) (Math.random() * 10);
        int c = (int) (Math.random() * 10);
        System.out.printf("%d+%d+%d=", a, b, c);
        int n = sc.nextInt();
        if (n == a + b + c) {
            System.out.println("Right");
        } else {
            System.out.println("Wrong");
        }
    }
}