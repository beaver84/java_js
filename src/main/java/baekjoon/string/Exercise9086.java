package baekjoon.string;

import java.io.IOException;
import java.util.Scanner;

public class Exercise9086 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < n; i++) {
            String str = sc.next();
            sb.append(str.charAt(0));
            sb.append(str.charAt(str.length()-1) + "\n");
        }
        System.out.println(sb);
    }
}
