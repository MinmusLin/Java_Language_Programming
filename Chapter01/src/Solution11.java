public class Solution11 {
    public static void main(String[] args) {
        int n = 312032486;
        int t = 365 * 24 * 60 * 60;
        int a = t / 7;
        int b = t / 13;
        int c = t / 45;
        for (int i = 0; i < 5; i++) {
            n += (a - b + c);
            System.out.println(n);
        }
    }
}