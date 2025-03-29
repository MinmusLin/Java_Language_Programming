package chapter03;

import java.util.Scanner;

public class Solution0320 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double temp = sc.nextDouble();
        double wind = sc.nextDouble();
        if (temp <= -58 || temp >= 41) {
            System.out.println("The temperature entered is invalid.");
        }
        if (wind < 2) {
            System.out.println("The wind speed is invalid.");
        }
        if (temp > -58 && temp < 41 && wind >= 2) {
            double windChillIndex = 35.74 + 0.6215 * temp - 35.75 * Math.pow(wind, 0.16) + 0.4275 * temp * Math.pow(wind, 0.16);
            System.out.println("The wind chill index is: " + windChillIndex);
        }
    }
}