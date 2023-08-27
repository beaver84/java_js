package inflearn.array;

import java.util.Scanner;


public class InfExercise2By6 {
    public boolean isPrime(int num) {
        if (num == 1) return false;
        for (int i = 2; i < num; i++) {
            if (num % i == 0) return false;
        }
        return true;
    }


    public String solution(int n, String str) {
        String answer = "";
        String[] temp = str.split(" ");
        for (int i = 0; i < temp.length; i++) {
            temp[i] = new StringBuilder(temp[i]).reverse().toString();
        }

        for (String x : temp) {
            if (isPrime(Integer.parseInt(x))) answer += String.valueOf(Integer.parseInt(x)) + " ";
        }
        return answer;
    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        InfExercise2By6 T = new InfExercise2By6();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        String str = sc.nextLine();

        System.out.println(T.solution(n, str));
    }
}