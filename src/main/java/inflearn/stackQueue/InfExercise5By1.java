package inflearn.stackQueue;

import java.util.Scanner;
import java.util.Stack;

public class InfExercise5By1 {
    public String solution(String string) {
        String answer = "YES";
        Stack<Character> stack = new Stack<>();
        for (char x : string.toCharArray()) {
            if(x=='(') stack.push(x);
            else{
                if(stack.isEmpty()) return "NO";
                stack.pop();
            }
        }
        if(!stack.isEmpty()) return "NO";
        return answer;
    }

    public static void main(String[] args) {
        InfExercise5By1 T = new InfExercise5By1();
        Scanner kb = new Scanner(System.in);
        String str = kb.next();
        System.out.println(T.solution(str));
    }
}
