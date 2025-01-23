import java.util.Scanner;

public class Solution14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double w = sc.nextDouble();
        double h = sc.nextDouble();
        double bmi = w * 0.45359237 / Math.pow(h * 0.0254, 2);
        System.out.println(bmi);
    }
}