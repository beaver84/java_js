package inflearn.stackQueue;

import java.util.Scanner;
import java.util.Stack;

public class InfExercise5By2 {
    public String solution(String str) {
        String answer = "";
        Stack<Character> stack = new Stack<>();
        for (char x : str.toCharArray()) {
            if(x==')'){
                while(stack.pop()!='(');
            }
            else stack.push(x);
        }
        for (int i = 0; i < stack.size(); i++) answer += stack.get(i);

        return answer;
    }

    public static void main(String[] args) {
        InfExercise5By2 T = new InfExercise5By2();
        Scanner kb = new Scanner(System.in);
        String str = kb.next();
        System.out.println(T.solution(str));
    }
}
