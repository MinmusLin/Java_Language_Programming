package chapter03;

import java.util.Scanner;

public class Solution0315 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = 100 + (int) (Math.random() * ((999 - 100) + 1));
        int guess = sc.nextInt();
        int guess3 = guess % 10;
        int guess2 = (guess / 10) % 10;
        int guess1 = (guess / 100) % 10;
        int lott3 = num % 10;
        int lott2 = (num / 10) % 10;
        int lott1 = (num / 100) % 10;
        if (num == guess) System.out.println("10000");
        else if (((guess3 == lott3) || (guess3 == lott2) || (guess3 == lott1)) && ((guess2 == lott3) || (guess2 == lott2) || (guess2 == lott1)) && ((guess1 == lott3) || (guess1 == lott2) || (guess1 == lott1))) {
            System.out.println("3000");
        } else if ((((guess3 == lott3) || (guess3 == lott2) || (guess3 == lott1)) ^ (((guess2 == lott3) || (guess2 == lott2) || (guess2 == lott1)) ^ ((guess1 == lott3) || (guess1 == lott2) || (guess1 == lott1))))) {
            System.out.println("1000");
        } else {
            System.out.println("0");
        }
    }
}