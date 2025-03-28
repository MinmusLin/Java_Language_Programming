package chapter03;

import java.util.Arrays;
import java.util.Scanner;

public class Solution0308 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] n = new int[3];
        for (int i = 0; i < 3; i++) {
            n[i] = sc.nextInt();
        }
        Arrays.sort(n);
        System.out.println(Arrays.toString(n));
    }
}