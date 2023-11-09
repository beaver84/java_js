package inflearn.string.secondTime;

import java.util.Scanner;

public class InfExercise1By2_6th {
    public String solution(String str) {
        String answer="";
        for (int i = 0; i < str.length(); i++) {
//            System.out.println(str.charAt(i)+" "+i+" "+str.indexOf(str.charAt(i)));
            if(str.indexOf(str.charAt(i))==i) answer += str.charAt(i);
        }
        return answer;
    }

    public static void main(String[] args) {
        InfExercise1By2_6th T = new InfExercise1By2_6th();
        Scanner kb = new Scanner(System.in);
        String str = kb.next();
        System.out.println(T.solution(str));
    }
}
