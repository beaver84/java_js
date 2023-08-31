package inflearn.string;

import java.util.Scanner;

public class InfExercise1By8 {
    public String solution(String s){
        String answer="NO";
        s = s.toUpperCase().replaceAll("[^A-Z]", "");
        String tmp=new StringBuilder(s).reverse().toString();
        if(s.equals(tmp)) answer = "YES";
        return answer;
    }

    public static void main(String[] args) {
        InfExercise1By8 T = new InfExercise1By8();
        Scanner kb = new Scanner(System.in);
        String str = kb.nextLine();

        System.out.print(T.solution(str));
    }
}
