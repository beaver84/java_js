package inflearn.string;

import java.util.Scanner;

public class InfExercise1By2 {
    public static String solution(String str){
        String answer="";

        for (char c : str.toCharArray()) {
            if (65 <= c && c <= 90) {
                c += 32;
            } else {
                c -= 32;
            }
            answer += c;
        }

        return answer;
    }

    public static void main(String[] args) {
        InfExercise1By2 T = new InfExercise1By2();
        Scanner kb = new Scanner(System.in);
        String str = kb.nextLine();

        System.out.print(solution(str));
    }
}
