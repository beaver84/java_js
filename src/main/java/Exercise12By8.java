public class Exercise12By8 {
    public static void main(String[] args) {
        Thread6_1 th1 = new Thread6_1();
        Thread6_2 th2 = new Thread6_2();

        th1.start();
        th2.start();

    }
}

class Thread6_1 extends Thread {
    public void run() {
        for (int i = 0; i < 300; i++) {
            System.out.print('-');
            yield();
        }
    }
}

class Thread6_2 extends Thread {
    public void run() {
        for (int i = 0; i < 300; i++) {
            System.out.print('|');
            yield();
        }
    }
}