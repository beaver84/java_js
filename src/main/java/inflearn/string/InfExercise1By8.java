package inflearn.string;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class InfExercise1By8 {
    public int solution(String str){
        int intAnswer=0;
        List<String> mAnswer = new ArrayList<>();

        for (char c : str.toCharArray()) {
            if (c >= 48 && c <= 57) {
                mAnswer.add(String.valueOf(c));
            }
        }

        StringBuilder sb = new StringBuilder();
        for (String s : mAnswer) {
            sb.append(s);
        }
        intAnswer = Integer.parseInt(sb.toString());
        return intAnswer;
    }

    public static void main(String[] args) {
        InfExercise1By8 T = new InfExercise1By8();
        Scanner kb = new Scanner(System.in);
        String str = kb.nextLine();

        System.out.print(T.solution(str));
    }
}
