import java.util.Scanner;

public class Solution16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        double s = Math.sqrt(3) * 3 * Math.pow(a, 2) / 2;
        System.out.println(s);
    }
}