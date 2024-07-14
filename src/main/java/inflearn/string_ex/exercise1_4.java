package inflearn.string_ex;

import java.util.ArrayList;
import java.util.Scanner;

public class exercise1_4 {
    public static void main(String[] args){
        exercise1_4 T = new exercise1_4();
        Scanner kb =new Scanner(System.in);
        int num = kb.nextInt();
        String[] str = new String[num];
        for(int i=0;i<num;i++){
            str[i]=kb.next();
        }
        for (String s : T.solution(num,str)) {
            System.out.println(s);
        }
    }

    private ArrayList<String> solution(int n, String[] str1) {
        ArrayList<String> answer = new ArrayList<>();
        for (String s : str1) {
            String tmp = new StringBuilder(s).reverse().toString();
            answer.add(tmp);
        }
        return answer;
    }
}
