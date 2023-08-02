package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Exercise25314 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        String result = "";

        for (int i = 0; i < N/4; i++) {
            result += "long ";
        }

        result += "int";

        System.out.println(result);
    }
}
