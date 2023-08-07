package baekjoon.string;

import java.io.IOException;
import java.util.Scanner;

public class Exercise11654 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        String str = sc.next();

        byte strToAscii = (byte) str.charAt(0);

        System.out.println(strToAscii);
    }
}
