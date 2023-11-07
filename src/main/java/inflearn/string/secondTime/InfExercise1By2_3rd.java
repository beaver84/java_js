package inflearn.string.secondTime;

import java.util.Scanner;

public class InfExercise1By2_3rd {
    public String solution(String str) {
        String answer = "";
        int maxLength = 0;
        String[] splittedStrs= str.split(" ");
        for (String s : splittedStrs) {
            if(s.length() > maxLength){
                maxLength = s.length();
                answer = s;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        InfExercise1By2_3rd T = new InfExercise1By2_3rd();
        Scanner kb = new Scanner(System.in);
        String str = kb.nextLine();
        System.out.print(T.solution(str));
    }
}
