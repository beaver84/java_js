package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Exercise25304 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int sumBefore = Integer.parseInt(br.readLine());
        int N = Integer.parseInt(br.readLine());
        int sumAfter = 0;

        StringTokenizer st;

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            sumAfter += (Integer.parseInt(st.nextToken()) * Integer.parseInt(st.nextToken()));
        }

        if (sumBefore == sumAfter){
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
