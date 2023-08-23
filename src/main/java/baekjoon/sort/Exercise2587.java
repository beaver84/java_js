package baekjoon.sort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;
import java.util.stream.IntStream;

public class Exercise2587 {
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);

        int A = in.nextInt();
        int B = in.nextInt();
        int C = in.nextInt();
        int D = in.nextInt();
        int E = in.nextInt();

        in.close();

        System.out.println((A+B+C+D+E)/5);
        int[] all = new int[5];
        all[0] = A;
        all[1] = B;
        all[2] = C;
        all[3] = D;
        all[4] = E;
        System.out.println(Arrays.stream(all).average());
    }
}
