package chapter03;

import java.util.Scanner;

public class Solution0311 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int month = sc.nextInt();
        int year = sc.nextInt();
        int days = switch (month) {
            case 1, 3, 5, 7, 8, 10, 12 -> 31;
            case 2 -> ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) ? 29 : 28;
            case 4, 6, 9, 11 -> 30;
            default -> 0;
        };
        String monthName = switch (month) {
            case 1 -> "January";
            case 2 -> "February";
            case 3 -> "March";
            case 4 -> "April";
            case 5 -> "May";
            case 6 -> "June";
            case 7 -> "July";
            case 8 -> "August";
            case 9 -> "September";
            case 10 -> "October";
            case 11 -> "November";
            case 12 -> "December";
            default -> "";
        };
        System.out.println(monthName + " " + year + " has " + days + " days");
    }
}