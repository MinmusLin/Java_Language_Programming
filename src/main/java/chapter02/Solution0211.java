package chapter02;

import java.util.Scanner;

public class Solution0211 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int initialNum = 312_032_486;
        int secondsNum = 365 * 24 * 60 * 60;
        double stepNum = secondsNum / 7.0 - secondsNum / 13.0 + secondsNum / 45.0;
        for (int i = 0; i < n; i++) {
            initialNum += (int) Math.round(stepNum);
        }
        System.out.println(initialNum);
    }
}