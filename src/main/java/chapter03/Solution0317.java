package chapter03;

import java.util.Scanner;

public class Solution0317 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int player = sc.nextInt();
        int comp = (int) (Math.random() * 3);
        if (player == comp) {
            System.out.println("It is a draw.");
        } else if (((comp == 0) && (player == 2)) || ((comp == 1) && (player == 0)) || ((comp == 2) && (player == 1))) {
            System.out.println("The computer wins.");
        } else {
            System.out.println("You win.");
        }
    }
}