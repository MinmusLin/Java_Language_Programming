import java.util.Scanner;

public class Solution21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        double b = sc.nextDouble() / 100 / 12;
        double c = sc.nextDouble();
        double d = a * Math.pow(1 + b, c * 12);
        System.out.println(d);
    }
}