class Exercise6By2 {
    public static void main(String[] args) {
        SutdaCard6by2 card1 = new SutdaCard6by2(3, false);
        SutdaCard6by2 card2 = new SutdaCard6by2();

        System.out.println(card1.info());
        System.out.println(card2.info());
    }
}

class SutdaCard6by2 {

    int num;
    boolean isKwang;

    public SutdaCard6by2(int num, boolean isKwang) {
        this.num = num;
        this.isKwang = isKwang;
    }

    public SutdaCard6by2() {
        this(1, true);
    }

    public String info() {
        return num + (isKwang == true? "K" : "");
    }
}
