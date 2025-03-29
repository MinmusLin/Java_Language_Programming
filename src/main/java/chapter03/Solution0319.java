package chapter03;

import java.util.Scanner;

public class Solution0319 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double edge1 = sc.nextDouble(), edge2 = sc.nextDouble(), edge3 = sc.nextDouble();
        boolean isValid = edge1 > 0 && edge2 > 0 && edge3 > 0 && (edge1 < (edge2 + edge3)) && (edge2 < (edge1 + edge3)) && (edge3 < (edge1 + edge2));
        if (isValid) {
            System.out.println("The perimeter is " + (edge1 + edge2 + edge3));
        } else {
            System.out.println("The input is invalid.");
        }
    }
}