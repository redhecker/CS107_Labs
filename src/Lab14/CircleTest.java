package Lab14;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CircleTest {
    public static void main(String[] args) {
        List<Circle> circleList = new ArrayList<>();
        Circle.setScreenSize(9);
        StdDraw.setScale(-Shape.getScreenSize(), Shape.getScreenSize());
        for (int i = 1; i <= Shape.getScreenSize(); i += 2) {
            circleList.add(new Circle(i, 0, i));
        }

        Collections.sort(circleList, Collections.reverseOrder());

        for (int i = 0; i < circleList.size(); i++) {
//            circleList.get(i).setColor(ShapeColor.values()[i%3]);
//            circleList.get(i).draw();
            circleList.get(i).customizedColor(ColorScheme.SKY, i);
        }
    }
}
