package inflearn.array;

import java.util.Scanner;


public class InfExercise7 {
    public int solution(int n, String str) {
        int answer = 0;
        String[] temp = str.split(" ");
        for (int i = 0; i < temp.length; i++) {
            answer += Integer.parseInt(temp[i]);
        }
        return answer;
    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        InfExercise7 T = new InfExercise7();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        String str = sc.nextLine();

        System.out.println(T.solution(n, str));
    }
}