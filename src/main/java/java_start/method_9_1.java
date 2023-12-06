package java_start;

public class method_9_1 {
    public static void main(String[] args) {
        extracted(1,2,3);
        extracted(15,25,35);

    }

    private static void extracted(int a, int b, int c) {
        int sum = a + b + c;
        double average = sum / 3.0;
        System.out.println("평균값: " + average);
    }
}