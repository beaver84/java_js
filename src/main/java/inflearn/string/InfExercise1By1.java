package inflearn.string;

import java.util.Scanner;

public class InfExercise1By1 {
    public static int solution(String str, String t){
        int answer=0;
        char tToChar = t.toUpperCase().toCharArray()[0];
        String strToUpperCase = str.toUpperCase();
        for (char c : strToUpperCase.toCharArray()) {
            if (c == tToChar) {
                answer += 1;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        InfExercise1By1 T = new InfExercise1By1();
        Scanner kb = new Scanner(System.in);
        String str = kb.nextLine();
        String t = String.valueOf(kb.nextLine().charAt(0));

        System.out.print(solution(str, t));
    }
}
