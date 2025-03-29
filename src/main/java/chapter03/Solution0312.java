package chapter03;

import java.util.Scanner;

public class Solution0312 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int reversedNum = 0;
        while (n > reversedNum) {
            reversedNum = reversedNum * 10 + n % 10;
            n /= 10;
        }
        System.out.println(reversedNum == n || reversedNum / 10 == n);
    }
}