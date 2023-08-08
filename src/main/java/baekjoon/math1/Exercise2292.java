package baekjoon.math1;

import java.io.IOException;
import java.util.Scanner;

public class Exercise2292 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        int M = sc.nextInt();

        int result = (1 + (int) Math.ceil((M - 2) / 6));

        System.out.println(result);
    }
}
