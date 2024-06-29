package wemade;

public class Ex1 {
    public String solution(int n) {
        String answer = "";
        if (n == 1){
            return "1";
        } else if (n == 2) {
//            System.out.println((n - 1) * 10 + (n - 1));
            return String.valueOf((n - 1) * 10 + (n - 1));
        } else if (n == 3) {
            System.out.println(((n - 1) * 10 + (n - 1))/10);
            return "0";
        }

        return answer;
    }

    public static void main(String[] args) {
        Ex1 solution = new Ex1();
        solution.solution(1);
        solution.solution(2);
        solution.solution(3);
        solution.solution(4);
        solution.solution(5);
    }
}
