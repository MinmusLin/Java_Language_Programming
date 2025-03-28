package chapter01;

public class Solution0107 {
    public static void main(String[] args) {
        double pi1 = 0;
        for (int i = 0; i < 6; i++) {
            pi1 += (i % 2 == 0 ? 1.0 : -1.0) / (2 * i + 1);
        }
        pi1 *= 4;
        System.out.println(pi1);
        double pi2 = 0;
        for (int i = 0; i < 7; i++) {
            pi2 += (i % 2 == 0 ? 1.0 : -1.0) / (2 * i + 1);
        }
        pi2 *= 4;
        System.out.println(pi2);
    }
}