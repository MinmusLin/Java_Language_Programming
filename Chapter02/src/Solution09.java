import java.util.Scanner;

public class Solution09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double v0 = sc.nextDouble();
        double v1 = sc.nextDouble();
        double t = sc.nextDouble();
        double a = (v1 - v0) / t;
        System.out.println(a);
    }
}