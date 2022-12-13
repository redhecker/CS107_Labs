package lab14;

import java.awt.*;

public class Rectangle extends Shape implements ColorDraw {

    private double width;
    private double height;

    public Rectangle(double x, double y) {
        super(x, y);

    }

    public Rectangle(double x, double y, double width, double height) {
        super(x, y);
        this.width = width;
        this.height = height;

    }


    public void checkColor() {
        if (isInBoundary()) {
            color = ShapeColor.GREEN;
        } else {
            color = ShapeColor.RED;
        }
    }

    public boolean isInBoundary() {
        if (-1 * Shape.getScreenSize() > x - this.width / 2
                || Shape.getScreenSize() < x + this.width / 2) {
            return false;
        }
        if (-1 * Shape.getScreenSize() > y - this.height / 2
                || Shape.getScreenSize() < y + this.height / 2) {
            return false;
        }
        return true;
    }


    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "width=" + width +
                ", height=" + height +
                super.toString() +
                "}\n";
    }

    public void draw() {
        StdDraw.setPenColor(color.getColor());
        StdDraw.filledRectangle(x, y, this.width / 2, this.height / 2);
    }


    private double area() {
        return this.width * this.height;
    }

    @Override
    public void customizedColor(ColorScheme colorScheme, int index) {
        Color[] colorList = colorScheme.getColorScheme();
        if (index < 0) {
            index = 0;
        }
        if (index >= colorList.length) {
            index = index % colorList.length;
        }
        StdDraw.setPenColor(colorList[index]);
        StdDraw.filledRectangle(x, y, this.width / 2, this.height / 2);
    }
}
