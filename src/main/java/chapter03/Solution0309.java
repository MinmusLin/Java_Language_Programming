package chapter03;

import java.util.Scanner;

public class Solution0309 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s = String.format("%09d", n);
        int w = 9;
        int sum = 0;
        while (n > 0) {
            sum += (n % 10) * w;
            n /= 10;
            w--;
        }
        System.out.println(s + ((sum % 11 == 10) ? "X" : String.valueOf(sum % 11)));
    }
}