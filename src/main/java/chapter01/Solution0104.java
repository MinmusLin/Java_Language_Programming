package chapter01;

public class Solution0104 {
    public static void main(String[] args) {
        System.out.println("a\ta^2\ta^3");
        for (int i = 1; i <= 4; i++) {
            System.out.printf("%d\t%d\t%d\n", i, i * i, i * i * i);
        }
    }
}