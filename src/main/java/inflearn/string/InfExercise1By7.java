package inflearn.string;

import java.util.Scanner;

public class InfExercise1By7 {
    public String solution(String str){
        String answer="NO";
        String tmp = new StringBuilder(str).reverse().toString();
        if (str.equalsIgnoreCase(tmp)) {
            answer = "YES";
        }

        return answer;
    }

    public static void main(String[] args) {
        InfExercise1By7 T = new InfExercise1By7();
        Scanner kb = new Scanner(System.in);
        String str = kb.nextLine();

        System.out.print(T.solution(str));
    }
}
