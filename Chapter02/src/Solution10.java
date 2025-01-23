import java.util.Scanner;

public class Solution10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double m = sc.nextDouble();
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double q = m * (b - a) * 4184;
        System.out.println(q);
    }
}