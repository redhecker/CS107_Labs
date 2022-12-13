package Lab8;

import java.util.Random;

public class Lab8_Practice1 {
    public static void main(String[] args) {
        Random random = new Random();
        int n = random.nextInt(5) + 5;

        Circle c , c1 , c2 ;
        c1 = new Circle(0, 0, 0, 0);
        c2 = new Circle(0, 0, 0, 0);
        for (int i = 0; i < n; i++) {
            double r = random.nextDouble() * 2 + 1.0;
            double x = random.nextDouble() * 3 + 2.0;
            double y = random.nextDouble() * 3 + 2.0;
            c = new Circle(i + 1, r, x, y);
            System.out.println(c);

            if(c.area()> c1.area()){ c1 = c; }
            if(distanceToOrigin(c) > distanceToOrigin(c2)){ c2 = c; }
        }
        System.out.print("Smallest circle: ");System.out.println(c1);
        System.out.print("Furthest circle: ");System.out.println(c2);
    }
    static double distanceToOrigin(Circle c){
        double d = Math.sqrt(c.getX()*c.getX()+c.getY()*c.getY());
        return d;
    }
}
