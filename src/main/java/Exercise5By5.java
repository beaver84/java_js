class Exercise5By5 {
    public static void main(String[] args) {
        int[] ballArr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[] ball3 = new int[3];
// 배열 ballArr의 임의의 요소 2개를 골라서 위치를 바꾼다. 20번 반복
        for (int x = 0; x < 20; x++) {
            int i = (int) (Math.random() * ballArr.length);
            int j = (int) (Math.random() * ballArr.length);
            int tmp = 0;

            tmp = ballArr[i];
            ballArr[i] = ballArr[j];
            ballArr[j] = tmp;
        }

        System.arraycopy(ballArr, 3, ball3, 0, 3);

        for (int j : ball3) {
            System.out.print(j);
        }
    } // end of main
} // end of class