package chapter02;

import java.util.Scanner;

public class Solution0208 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int offset = sc.nextInt();
        long utcMillis = System.currentTimeMillis();
        long targetMillis = utcMillis + offset * 60 * 60 * 1000L;
        long totalSeconds = targetMillis / 1000;
        int seconds = (int) (totalSeconds % 60);
        int totalMinutes = (int) (totalSeconds / 60);
        int minutes = totalMinutes % 60;
        int totalHours = totalMinutes / 60;
        int hours = totalHours % 24;
        System.out.printf("%02d:%02d:%02d\n", hours, minutes, seconds);
    }
}