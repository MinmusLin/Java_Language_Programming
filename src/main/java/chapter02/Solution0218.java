package chapter02;

public class Solution0218 {
    public static void main(String[] args) {
        System.out.println("a\tb\tpow(a, b)");
        for (int i = 1; i <= 5; i++) {
            System.out.printf("%d\t%d\t%d\n", i, i + 1, (int) Math.pow(i, i + 1));
        }
    }
}