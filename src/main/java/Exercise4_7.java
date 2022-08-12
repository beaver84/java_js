class Exercise4_7 {
    public static void main(String[] args) {

        //Math.random() 을 이용해서 1~6부터 사이의 임의의 정수를 변수에 저장
        int value = (int)(Math.random() * 60)/10 + 1;
        System.out.println("value:"+value);
    }
}
