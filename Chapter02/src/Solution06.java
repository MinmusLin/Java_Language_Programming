import java.util.Scanner;

public class Solution06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = n / 100;
        int b = n % 100 / 10;
        int c = n % 10;
        int t = a + b + c;
        System.out.println(t);
    }
}