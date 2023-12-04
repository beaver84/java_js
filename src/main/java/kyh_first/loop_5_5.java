package kyh_first;

import java.util.Scanner;

public class loop_5_5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int rows = scanner.nextInt();
        for(int i = 0; i < rows; i++){
            for(int j = 0; j <= i; j++){
                System.out.print('*');
            }
            System.out.println();
        }
    }

}
