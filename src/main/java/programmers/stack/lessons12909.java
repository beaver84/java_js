package programmers.stack;

import java.util.Stack;

public class lessons12909 {

    public static void main(String[] args) {
        String s = ")()(";
        System.out.println(solution(s));
    }

    private static boolean solution(String s) {
        boolean answer = true;

        Stack<Object> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                stack.push('(');
            }else{
                if(stack.isEmpty()) answer = false;
                else stack.pop();
            }
        }
        if(answer) answer = stack.isEmpty();

        return answer;
    }
}
