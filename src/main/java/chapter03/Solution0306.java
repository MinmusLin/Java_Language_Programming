package chapter03;

import java.util.Scanner;

public class Solution0306 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double weightPounds = scanner.nextDouble();
        double feet = scanner.nextDouble();
        double inches = scanner.nextDouble();
        double weightKg = weightPounds * 0.453592;
        double heightMeters = feet * 0.3048 + inches * 0.0254;
        double bmi = weightKg / (heightMeters * heightMeters);
        System.out.println(bmi);
    }
}