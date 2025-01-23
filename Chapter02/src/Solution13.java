import java.util.Scanner;

public class Solution13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        double n = 0;
        for (int i = 0; i < 6; i++) {
            n += a;
            n *= (1 + 0.00417);
        }
        System.out.println(n);
    }
}