package inflearn.array;

import java.util.Scanner;

public class InfExercise6 {

    public static int isPrime(int inputNum) {
        return inputNum;
    }

    public static int[] toBackward(int[] inputArray) {
        return inputArray;
    }

    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        int N = in.nextInt();
        int[] intInputArray = new int[N];

        for (int i = 0; i < N; i++) {
            intInputArray[i] += in.nextInt();
        }

        toBackward(intInputArray);


        System.out.println(N);π

        for (int i : intInputArray) {
            System.out.print(isPrime(i) + " ");
        }
        return ;
    }
}
