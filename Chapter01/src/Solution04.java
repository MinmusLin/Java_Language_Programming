public class Solution04 {
    public static void main(String[] args) {
        System.out.println("a\ta^2\ta^3");
        for (int i = 1; i <= 4; i++) {
            System.out.printf("%d\t%d\t%d\n", i, (int) Math.pow(i, 2), (int) Math.pow(i, 3));
        }
    }
}