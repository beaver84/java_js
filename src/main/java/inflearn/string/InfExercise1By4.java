package inflearn.string;

import java.util.ArrayList;
import java.util.Scanner;

public class InfExercise1By4 {
    public static ArrayList<String> solution(int n, String[] str){
        ArrayList<String> answer= new ArrayList<>();
        return answer;
    }

    public static void main(String[] args) {
        InfExercise1By4 T = new InfExercise1By4();
        Scanner kb = new Scanner(System.in);
        int n=kb.nextInt();
        String[] str=new String[n];
        for(int i=0; i<n; i++){
            str[i]=kb.next();
        }
        for(String x : T.solution(n, str)){
            System.out.println(x);
        }
    }
}
