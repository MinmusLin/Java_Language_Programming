import java.util.Scanner;

public class Solution02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double r = sc.nextDouble();
        double h = sc.nextDouble();
        double s = Math.PI * Math.pow(r, 2);
        double v = s * h;
        System.out.println(s);
        System.out.println(v);
    }
}