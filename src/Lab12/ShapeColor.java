package Lab12;

import java.awt.*;

enum ShapeColor {
    GREEN(Color.GREEN),
    RED(Color.RED),
    GRAY(Color.RED);

    Color color;
    ShapeColor(Color color){
        this.color = color;
    }
    public Color getColor(){
        return color;
    }
}
