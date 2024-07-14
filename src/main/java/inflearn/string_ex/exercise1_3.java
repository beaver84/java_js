package inflearn.string_ex;

import java.util.Scanner;

public class exercise1_3 {
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        String str1 = in.nextLine();
        System.out.println(solution(str1));
    }

    private static String solution(String str1) {

        //문장을 ' '(공백)을 기준으로 split하여 배열에 저장
        String[] str1ToArray = str1.split(" ");

        //for문을 돌리며 i=0 부터 가장 길이가 긴 단어를 찾는다.
        int length = 0;
        String result = "";

        for(int i=0;i<str1ToArray.length;i++){
            //가장 길이가 긴 단어를 찾으면 출력한다.
            if(str1ToArray[i].length()>length){
                result = str1ToArray[i];
                length = str1ToArray[i].length();
            }
        }
        return result;
    }
}
