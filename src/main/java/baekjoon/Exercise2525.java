package baekjoon;

import java.util.Scanner;

public class Exercise2525 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int A = in.nextInt();
        int B = in.nextInt();
        int C = in.nextInt();

        if (B + C < 60){
            System.out.println(A + " " + (B + C));
        } else if( B + C >= 60){
            if(A + (B + C)/60 < 24) {
                System.out.println(A + (B + C) / 60 + " " + (B + C)%60);
            } else {
                System.out.println((A + (B + C) / 60 - 24) + " " + (B + C -60)%60);
            }
        }

        in.close();
    }
}
