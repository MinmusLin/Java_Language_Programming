import java.util.Scanner;

public class Solution12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double v = sc.nextDouble();
        double a = sc.nextDouble();
        double s = Math.pow(v, 2) / (2 * a);
        System.out.println(s);
    }
}