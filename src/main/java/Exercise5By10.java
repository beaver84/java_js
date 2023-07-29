class Exercise5_10 {
    public static void main(String[] args) {
        char[] abcCode =
                {'`', '~', '!', '@', '#', '$', '%', '^', '&', '*',
                        '(', ')', '-', '_', '+', '=', '|', '[', ']', '{',
                        '}', ';', ':', ',', '.', '/'};
        // 0 1 2 3 4 5 6 7 8 9
        char[] numCode = {'q', 'w', 'e', 'r', 't', 'y', 'u', 'i', 'o', 'p'};
        String src = "abc123";
        String result = "";
        // 문자열 src의 문자를 charAt()으로 하나씩 읽어서 변환 후 result에 저장
        for (int i = 0; i < src.length(); i++) {
            char ch = src.charAt(i);
            if (ch == 'a') {
                result += String.valueOf(abcCode[0]);
            } else if (ch == 'b') {
                result += String.valueOf(abcCode[1]);
            } else if (ch == 'c') {
                result += String.valueOf(abcCode[2]);
            } else if (ch == '1') {
                result += String.valueOf(numCode[1]);
            } else if (ch == '2') {
                result += String.valueOf(numCode[2]);
            } else if (ch == '3') {
                result += String.valueOf(numCode[3]);
            }
        }
        System.out.println("src:" + src);
        System.out.println("result:" + result);
    } // end of main
} // end of class