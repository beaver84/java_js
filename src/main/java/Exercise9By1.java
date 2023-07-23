public class Exercise9By1 {
    public static void main(String[] args) {
        SutdaCard2 c1 = new SutdaCard2(3, true);
        SutdaCard2 c2 = new SutdaCard2(3, true);

        System.out.println("c1=" + c1);
        System.out.println("c2=" + c2);
        System.out.println("c1.equals(c2):" + c1.equals(c2));
    }
}

class SutdaCard2 {
    int num;
    boolean isKwang;

    SutdaCard2(){
        this(1, true);
    }

    SutdaCard2(int num, boolean isKwang) {
        this.num = num;
        this.isKwang = isKwang;
    }

    public boolean equals(Object obj) {
        if(obj!=null && obj instanceof SutdaCard2){
            return num == ((SutdaCard2) obj).num && isKwang == ((SutdaCard2) obj).isKwang;
        } else {
            return false;
        }
    }

    public String toString() {
        return num + (isKwang ? "K" : "");
    }
}