package lab12;

import java.util.ArrayList;

public class InterfaceTest {
    public static void main(String[] args) {
        ArrayList<Shape> shapeList = new ArrayList<Shape>();

        Shape.setScreenSize(9);
        StdDraw.setXscale(-Shape.getScreenSize(), Shape.getScreenSize());
        StdDraw.setYscale(-Shape.getScreenSize(), Shape.getScreenSize());

        for (int i = 0; i < 3; i++) {
            Circle c = new Circle(1, 4 * i + 1, 1);
            c.customizedColor(ColorScheme.RAINBOW, i);
            shapeList.add(c);

            Rectangle r = new Rectangle(4 * i + 1, -1, 1,1);
            r.customizedColor(ColorScheme.SKY, i);
            shapeList.add(r);
        }
    }
}
