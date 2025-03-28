package chapter02;

import java.util.Scanner;

public class Solution0223 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double distance = sc.nextDouble();
        double milesOfGallon = sc.nextDouble();
        double priceOfGallon = sc.nextDouble();
        double cost = (int) (distance / milesOfGallon * priceOfGallon * 1000) / 1000.0;
        System.out.print(cost);
    }
}