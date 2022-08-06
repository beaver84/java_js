public class Market {
    public static void main(String[] args) {
        Buyer b = new Buyer();
        b.buy(new Tv());
        b.buy(new Computer());
        b.buy(new Tv());
        b.buy(new Audio());
        b.buy(new Computer());
        b.buy(new Computer());
        b.buy(new Computer());

        b.summary();
    }
}

class Buyer {
    int money = 1000;
    Product[] cart = new Product[3];
    int i = 0;

    void buy(Product p) {
        if(this.money < p.price){
            System.out.println("잔액이 부족하여 " + p + "을 살 수 없습니다.");
        } else {
            this.money = money - p.price;
            add(p);
        }
    }

    void add(Product p) {
        if (i >= cart.length){
            Product[] newCart = new Product[cart.length * 2];
            System.arraycopy(cart, 0, newCart, 0, cart.length);
            cart = newCart;
        } else {
            cart[i] = p;
            i++;
        }
    }

    void summary() {
        System.out.print("구입한 물건 : ");
        for (Product product : cart) {
            System.out.print(product + ",");
        }
        System.out.println();

        int sum = 0;
        for (Product product : cart) {
            if(product != null) {
                sum += product.price;
            }
        }
        System.out.println("사용한 금액 : " + sum);
        System.out.println("남은 금액 : " + (this.money - sum));
    }
}

class Product {
    int price;

    Product(int price) {
        this.price = price;
    }
}

class Tv extends Product {
    Tv(){super(100);}

    public String toString() {return "Tv";}
}

class Computer extends Product{
    Computer(){super(200);}

    public String toString() {
        return "Computer";}
}

class Audio extends Product {
    Audio(){ super(50);}

    public String toString() {
        return "Audio";}
}
