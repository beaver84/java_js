import java.util.stream.IntStream;

class SutdaDeck3 {
    final int CARD_NUM = 20;
    SutdaCard3[] cards = new SutdaCard3[CARD_NUM];
    SutdaDeck3() {

        IntStream.range(0, cards.length).forEach(i -> {
            int num = i % 10 + 1;
            boolean isKwang = (i < 10) && (num == 1 || num == 3 || num == 8);
            cards[i] = new SutdaCard3(num, isKwang);
        });
    }
}
class SutdaCard3 {
    int num;
    boolean isKwang;
    SutdaCard3() {
        this(1, true);
    }
    SutdaCard3(int num, boolean isKwang) {
        this.num = num;
        this.isKwang = isKwang;
    }
    public String toString() {
        return num + ( isKwang ? "K":"");
    }
}
class Exercise7_1 {
    public static void main(String args[]) {
        SutdaDeck3 deck = new SutdaDeck3();
        for(int i=0; i < deck.cards.length;i++)
            System.out.print(deck.cards[i]+",");
    }
}
