package inflearn.string.secondTime;

import java.util.Scanner;

public class InfExercise1By2_2nd {
    public String solution(String str) {
        String answer = "";

        for (char s : str.toCharArray()) {
            if ('A' <= s && s < 'Z') {
                answer += (char) (s + 32);
            }else{
                answer += (char) (s - 32);
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        InfExercise1By2_2nd T = new InfExercise1By2_2nd();
        Scanner kb = new Scanner(System.in);
        String str = kb.next();
        System.out.print(T.solution(str));
    }
}
