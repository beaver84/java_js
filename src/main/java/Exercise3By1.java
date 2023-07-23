class Exercise3By1 {
    public static void main(String[] args) {
        int x = 2;
        int y = 5;
        char c = 'A';  // 'A'의 문자코드는 65

        System.out.println(1 + x << 33);
        /*
        '1 + x << 33'는 x의 값이 2이므로 '1 + 2 << 33'가 된다. 덧셈연산자(+)보다 쉬프트연산
        자(<<)가 우선순위가 낮으므로 '3 << 33'이 된다. int는 32 bit이므로 33번 쉬프트 하지
        않고 1번만 쉬프트 한다. '3 << 1'은 3에 ‘2
         */
        System.out.println(y >= 5 || x < 0 && x > 2);
        System.out.println(y += 10 - x++);
        System.out.println(x += 2);
        System.out.println(!('A' <= c && c <= 'Z'));
        System.out.println('C' - c);
        System.out.println('5' - '0');
        System.out.println(c + 1);
        System.out.println(++c);
        System.out.println(c++);
        System.out.println(c);
    }
}
