public class Solution07 {
    public static void main(String[] args) {
        double pi1 = 0;
        double pi2 = 0;
        for (int i = 1; i <= 6; i++) {
            pi1 += 1.0 / (2 * i - 1) * (i % 2 == 0 ? -1 : 1);
        }
        for (int i = 1; i <= 7; i++) {
            pi2 += 1.0 / (2 * i - 1) * (i % 2 == 0 ? -1 : 1);
        }
        pi1 *= 4;
        pi2 *= 4;
        System.out.println(pi1);
        System.out.println(pi2);
    }
}