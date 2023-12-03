package inflearn.array;

import java.util.Scanner;


public class InfExercise2By8 {
    public int[] solution(int n, int[] arr) {
        int[] answer = new int[n];

        for (int i = 0; i < arr.length; i++) {
            int cnt = 1;
            for (int j = 0; j < n; j++){
                if(arr[i] < arr[j]){
                    ++cnt;
                }
                answer[i] = cnt;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        InfExercise2By8 T = new InfExercise2By8();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = kb.nextInt();
        }
        for(int x :T.solution(n, arr)) System.out.print(x + " ");
    }
}