import java.util.Scanner;

public class Solution07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int d = n / (60 * 24);
        int y = d / 365;
        d = d % 365;
        System.out.println(y);
        System.out.println(d);
    }
}