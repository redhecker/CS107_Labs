package Lab8;

public class Circle {
    private double radius;
    private double x;
    private double y;
    private int id;
    public static int cnt = 0;

    public Circle(double radius) {
        this.radius = radius;
        cnt++;
    }

    public Circle(int id ,double radius, double x, double y) {
        this.radius = radius;
        this.x = x;
        this.y = y;
        this.id = id;
    }
    public double getX() {
        return x;
    }
    public double getY() {
        return y;
    }
    public int getId() {
        return id;
    }
    public double getRadius(){ return radius;}
    public double area() {
        return radius * radius * Math.PI;
    }

    public String toString(){
        return String.format("Circle #%d: radius = %.2f, x = %.2f, y = %.2f" ,id,radius,x,y);
    }

}
