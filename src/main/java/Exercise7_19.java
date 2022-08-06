import java.util.Arrays;

public class Exercise7_19 {

    public static void main(String[] args) {

        Buyer b = new Buyer();
        b.buy(new Tv2());
        b.buy(new Computer());
        b.buy(new Tv2());
        b.buy(new Audio());
		b.buy(new Computer());
		b.buy(new Computer());
		b.buy(new Computer());
        b.summary();
    }

}

class Buyer {
    int money = 1000;
    Product2[] cart = new Product2[3];
    int i = 0;

    void buy(Product2 p) {

        if(money < p.price) { // 물건의 가격이 가진 돈 보다 큰 경우
            return;
        } else {
            add(p);
            money -= p.price;
        }
    }

    void add(Product2 p) {
        for(int i = 0; i < cart.length; i++) {
            if(cart[i] == null) {
                cart[i] = p;
                System.out.println("add: "+cart[i]);
                return;
            }
        }

        //카트의 길이가 부족한 경우 복사
        Product2[] cart2 = new Product2[cart.length*2];
        for(int i = 0; i < cart.length; i++) {
            cart2[i] = cart[i];
        }

        cart = new Product2[cart.length*2];
        for(int i = 0; i < cart2.length; i++) {
            cart[i] = cart2[i];
        }

        add(p);

    }

    void summary() {
        String list = "";
        int sum = 0;


        for(int i = 0; i < cart.length; i++) {
            if(cart[i] != null) {
                sum += cart[i].price;
                list += cart[i].toString() +" ";
            }
        }
        System.out.println("구입한 물건: " + list);
        System.out.println("총 사용 금액: " + sum);
        System.out.println("남은 금액: " + money);
    }
}

class Product2 {
    int price;

    Product2(int price) {
        this.price = price;
    }
}

class Tv2 extends Product2 {
    Tv2() {
        super(100);
    }

    public String toString() {
        return "Tv";
    }
}

class Computer extends Product2 {
    Computer() {
        super(200);
    }

    public String toString() {
        return "Computer";
    }
}

class Audio extends Product2 {
    Audio() {
        super(50);
    }

    public String toString() {
        return "Audio";
    }
}