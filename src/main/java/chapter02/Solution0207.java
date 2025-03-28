package chapter02;

import java.util.Scanner;

public class Solution0207 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int min = sc.nextInt();
        int day = min / (60 * 24);
        System.out.println(day / 365);
        System.out.println(day % 365);
    }
}