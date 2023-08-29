package inflearn.string;

import java.util.Scanner;

public class InfExercise1By6 {
    public String solution(String str){
        String answer="";

        for (int i = 0; i < str.length(); i++) {
            if (str.indexOf(str.charAt(i)) == i) {
                answer += str.charAt(i);
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        InfExercise1By6 T = new InfExercise1By6();
        Scanner kb = new Scanner(System.in);
        String str = kb.nextLine();

        System.out.print(T.solution(str));
    }
}
