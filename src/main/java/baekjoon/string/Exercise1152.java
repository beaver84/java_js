package baekjoon.string;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Exercise1152 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String S = in.nextLine();
        in.close();

        StringTokenizer st = new StringTokenizer(S," ");

        System.out.println(st.countTokens());

    }
}