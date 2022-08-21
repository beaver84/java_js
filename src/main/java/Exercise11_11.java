import java.util.*;

class SutdaCard11_11 {
    int num;
    boolean isKwang;

    SutdaCard11_11() {
        this(1, true);
    }

    SutdaCard11_11(int num, boolean isKwang) {
        this.num = num;
        this.isKwang = isKwang;
    }

    public boolean equals(Object obj) {
        if (obj instanceof SutdaCard11_11) {
            SutdaCard11_11 c = (SutdaCard11_11) obj;
            return num == c.num && isKwang == c.isKwang;
        } else {
            return false;
        }
    }

    public String toString() {
        return num + (isKwang ? "K" : "");
    }

    @Override
    public int hashCode() {
        return toString().hashCode();
    }
}

class Exercise11_11 {
    public static void main(String[] args) {
        SutdaCard11_11 c1 = new SutdaCard11_11(3, true);
        SutdaCard11_11 c2 = new SutdaCard11_11(3, true);
        SutdaCard11_11 c3 = new SutdaCard11_11(1, true);
        HashSet set = new HashSet();
        set.add(c1);
        set.add(c2);
        set.add(c3);
        System.out.println(set);
    }
}