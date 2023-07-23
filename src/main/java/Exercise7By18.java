class Exercise7_18 {
    /*
    (1) action메서드를 작성하시오.
    */

    public static void action(Object o) {
        if (o instanceof DanceRobot2) {
            DanceRobot2 danceRobot2 = new DanceRobot2();
            danceRobot2.dance();
        } else if (o instanceof SingRobot2){
            SingRobot2 singRobot2 = new SingRobot2();
            singRobot2.sing();
        } else {
            DrawRobot2 drawRobot2 = new DrawRobot2();
            drawRobot2.draw();
        }
    }

    public static void main(String[] args) {
        Robot2[] arr = { new DanceRobot2(), new SingRobot2(), new DrawRobot2()};
        for(int i=0; i< arr.length;i++)
            action(arr[i]);
    } // main
}
class Robot2 {}
class DanceRobot2 extends Robot2 {
    void dance() {
        System.out.println("춤을 춥니다.");
    }
}
class SingRobot2 extends Robot2 {
    void sing() {
        System.out.println("노래를 합니다.");
    }
}
class DrawRobot2 extends Robot2 {
    void draw() {
        System.out.println("그림을 그립니다.");
    }
}