package baekjoon;

import java.util.Scanner;

public class Exercise9498 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int score = in.nextInt();

        in.close();

        if (score >= 90 && score <= 100) {
            System.out.println("A");
        } else if (score >= 80 && score < 90) {
            System.out.println("B");
        } else if (score >= 70 && score < 80) {
            System.out.println("C");
        } else if (score >= 60 && score <= 69) {
            System.out.println("D");
        } else {
            System.out.println("F");
        }

    }
}
