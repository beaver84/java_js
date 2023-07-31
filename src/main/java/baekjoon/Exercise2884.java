package baekjoon;

import java.util.Scanner;

public class Exercise2884 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int A = in.nextInt();
        int B = in.nextInt();

        in.close();

        if(B>=45) {
            System.out.println(A + " " + (B-45));
        }else {
            if(A != 0) {
                System.out.println(A - 1 + " " + (60 - (45 - B)));
            }else{
                System.out.println(23 + " " + (60 - (45 - B)));
            }
        }
    }
}
