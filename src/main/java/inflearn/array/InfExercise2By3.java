package inflearn.array;

import java.util.Scanner;


public class InfExercise2By3 {

    public String solution(int n, int[] a, int[] b) {
        String answer="";

        return answer;
    }

    public static void main(String[] args) {
        InfExercise2By3 T = new InfExercise2By3();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int[] a = new int[n];
        int[] b = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = kb.nextInt();
        }
        for (int i = 0; i < n; i++) {
            b[i] = kb.nextInt();
        }
        System.out.print( T.solution(n, a, b));
    }
}