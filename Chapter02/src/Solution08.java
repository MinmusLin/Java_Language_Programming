import java.util.Scanner;

public class Solution08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double offset = sc.nextInt();
        long n = System.currentTimeMillis();
        n /= 1000;
        n %= 24 * 60 * 60;
        int s = (int)(n % 60);
        n /= 60;
        int m = (int)(n % 60);
        n /= 60;
        int h = (int)((n + offset) % 24);
        System.out.printf("%d:%d:%d", h, m, s);
    }
}