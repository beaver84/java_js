public class Exercise7_23 {

    static double sumArea(Shape[] arr) {
        if(arr[0] instanceof Circle){
            arr[0].calcArea();
        }
        if(arr[1] instanceof Rect){
            arr[1].calcArea();
        }
        if(arr[2] instanceof  Circle){
            arr[2].calcArea();
        }
        return arr[0].calcArea() + arr[1].calcArea() + arr[2].calcArea();
    }

    public static void main(String[] args) {
        Shape[] arr = {new Circle(5.0), new Rect(3, 4), new Circle(1)};
        System.out.println("SUM :" + sumArea(arr));
    }
}

abstract class Shape {
    Point p;

    Shape() {
        this(new Point(0, 0));
    }

    Shape(Point p) {
        this.p = p;
    }

    abstract double calcArea();

    Point getPosition(){
        return p;
    }

    void setPosition(Point p){
        this.p = p;
    }
}

class Point {
    int x;
    int y;

    Point(){
        this(0,0);
    }

    Point(int x, int y){
        this.x=x;
        this.y=y;
    }
    public String toString() {
        return "["+x+","+y+"]";
    }
}

class Circle extends Shape{
    double r;

    Circle(double r){
        this(new Point(0,0), r);
    }

    Circle(Point p, double r){
        super(p);
        this.r = r;
    }

    double calcArea(){
        return Math.PI * r * r;
    }
}

class Rect extends Shape{
    double width;
    double height;

    Rect(double width, double height){
        this(new Point(0,0), width, height);
    }

    Rect(Point p, double width, double height){
        super(p);
        this.width = width;
        this.height = height;
    }

    boolean isSquare(){
        return width*height!=0 && width==height;
    }

    double calcArea(){
        return width * height;
    }
}

