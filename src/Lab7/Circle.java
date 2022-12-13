package Lab7;
public class Circle {
    private double radius;
    private double x;
    private double y;
    public static int cnt = 0;


    public double area() {
            return radius * radius * Math.PI;
    }

    public double perimeter() {
        return 2 * Math.PI * radius;
    }

    public void position() {
        System.out.printf("Position of the circle is (%.1f,%.1f)\n", x, y);
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        if (radius > 0) {
            this.radius = radius;
        }
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public Circle(double radius) {
        this.radius = radius;
        cnt++;
    }


    public Circle(double radius, double x, double y) {
        this.radius = radius;
        this.x = x;
        this.y = y;
        cnt++;
    }

}


