package chapter03;

import java.util.Scanner;

public class Solution0318 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double weight = sc.nextDouble();
        if (weight <= 0) {
            System.out.println("Invalid input.");
        } else if (weight > 20) {
            System.out.println("The package can not be shipped.");
        } else {
            double costOfShipping;
            if (weight <= 1) {
                costOfShipping = 3.5;
            } else if (weight <= 3) {
                costOfShipping = 5.5;
            } else if (weight <= 10) {
                costOfShipping = 10;
            } else {
                costOfShipping = 20;
            }
            System.out.println("Total cost for shipping " + weight + " pounds is " + costOfShipping + "$.");
        }
    }
}