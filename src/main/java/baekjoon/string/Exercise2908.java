package baekjoon.string;

import java.io.IOException;
import java.util.Scanner;

public class Exercise2908 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        String str = sc.next();
        String str2 = sc.next();

        String[] strBack = new String[3];
        String[] strBack2 = new String[3];

        strBack[0]= String.valueOf(str.charAt(2));
        strBack[1]= String.valueOf(str.charAt(1));
        strBack[2]= String.valueOf(str.charAt(0));

        strBack2[0]= String.valueOf(str2.charAt(2));
        strBack2[1]= String.valueOf(str2.charAt(1));
        strBack2[2]= String.valueOf(str2.charAt(0));

        String strBackResult = strBack[0] + strBack[1] + strBack[2];
        String strBackResult2 = strBack2[0] + strBack2[1] + strBack2[2];

        int toInt = Integer.parseInt(strBackResult);
        int toInt2 = Integer.parseInt(strBackResult2);

        if(toInt > toInt2){
            System.out.println(toInt);
        }else{
            System.out.println(toInt2);
        }
    }
}
