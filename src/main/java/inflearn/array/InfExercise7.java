package inflearn.array;

import java.util.Scanner;


public class InfExercise7 {
    public int solution(int n, int[] arr) {
        int answer = 0;
        int tmp = 1;
        if (arr[0] == 1) {
            answer += tmp;
        }
        for (int i = 1;  i < n; i++){
            if(arr[i] == 1 && arr[i] == arr[i-1]){
                tmp ++;
                answer += tmp;
            } else if(arr[i] == 1 && arr[i] != arr[i - 1]) {
                tmp = 1;
                answer += tmp;
            } else {
                tmp = 1;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        InfExercise7 T = new InfExercise7();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = kb.nextInt();

        System.out.println(T.solution(n, arr));
    }
}