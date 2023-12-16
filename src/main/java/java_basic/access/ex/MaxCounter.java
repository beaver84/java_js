package java_basic.access.ex;

public class MaxCounter {
    private int num;
    private int maxNum;

    public MaxCounter(int maxNum) {
        this.maxNum = maxNum;
    }

    public void increment() {
        if(num < maxNum) {
            num++;
        }else{
            System.out.println("최대값을 초과할 수 없습니다.");
        }
    }

    public int getCounter() {
        return num;
    }
}
