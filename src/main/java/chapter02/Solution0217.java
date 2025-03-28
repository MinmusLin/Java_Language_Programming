package chapter02;

import java.util.Scanner;

public class Solution0217 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double temperature = sc.nextDouble();
        double speedOfWind = sc.nextDouble();
        double twc = 35.74 + 0.6215 * temperature - 35.75 * Math.pow(speedOfWind, 0.16) + 0.4275 * temperature * Math.pow(speedOfWind, 0.16);
        System.out.print(twc);
    }
}