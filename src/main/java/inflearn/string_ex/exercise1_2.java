package inflearn.string_ex;

import java.util.Scanner;

public class exercise1_2 {



    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        String str1 = in.next();
        System.out.println(solution(str1));
    }

    private static char[] solution(String str1) {

//        //str1을 char 배열로 변환
//        str1 = str1.toUpperCase();
//        str2 = str2.toUpperCase();
//        char[] strArr = str1.toCharArray();
//
//        int count = 0;
//        //for 문으로 str1 에서 str2가 몇개 있는지 검사
//        for (int i = 0; i < strArr.length; i++) {
//            if(strArr[i] == str2.charAt(0)) {
//                count ++;
//            }
//        }

        //str1을 char 배열로 변환
        char[] strArr = str1.toCharArray();
        char[] result = new char[strArr.length];

        //for문으로 i를 증가시키면서 한문자씩 소문자/대문자인지 판별
        for(int i=0;i<strArr.length;i++){
            if (strArr[i] >= 65 && strArr[i] < 97 ){
                result[i] += (char)(strArr[i] + 32);
            }else{
                result[i] += (char)(strArr[i] - 32);
            }
        }
        return result;
    }
}