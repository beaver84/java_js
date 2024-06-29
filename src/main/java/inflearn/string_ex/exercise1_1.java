package inflearn.string_ex;

import java.util.Scanner;

public class exercise1_1 {



    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        String str1 = in.next();
        String str2 = in.next();
        System.out.println(solution(str1, str2));
    }

    private static int solution(String str1, String str2) {

       //str1을 char 배열로 변환
        str1 = str1.toUpperCase();
        str2 = str2.toUpperCase();
        char[] strArr = str1.toCharArray();

        int count = 0;
       //for 문으로 str1 에서 str2가 몇개 있는지 검사
        for (int i = 0; i < strArr.length; i++) {
            if(strArr[i] == str2.charAt(0)) {
                count ++;
            }
        }


        return count;
    }
}
