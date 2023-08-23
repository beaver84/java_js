package inflearn.array;

import java.util.Scanner;

public class InfExercise6 {
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        int N = in.nextInt();
        int[] intInputArray = new int[N];

        for (int i = 0; i < N; i++) {
            intInputArray[i] += in.nextInt();
        }

        System.out.println(N);

        for (int i : intInputArray) {
            System.out.print(i + " ");
        }
        return ;
    }
}
