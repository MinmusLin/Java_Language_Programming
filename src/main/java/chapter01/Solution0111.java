package chapter01;

public class Solution0111 {
    public static void main(String[] args) {
        int initialNum = 312_032_486;
        int secondsNum = 365 * 24 * 60 * 60;
        double stepNum = secondsNum / 7.0 - secondsNum / 13.0 + secondsNum / 45.0;
        for (int i = 0; i < 5; i++) {
            initialNum += (int) Math.round(stepNum);
            System.out.println(initialNum);
        }
    }
}