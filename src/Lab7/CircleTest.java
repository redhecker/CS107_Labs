package Lab7;

//public class CircleTest {
//
//    public static void main(String[] args) {
//        Circle c1=new Circle(1,2,3);
//        System.out.printf("The area of c1 is %.2f\n", c1.area());
//        System.out.printf("The perimeter of c1 is %.2f\n", c1.perimeter());
//        c1.position();
//
//        c1.setRadius(5);
//        System.out.println(c1.getRadius());
//        ArrayList<Circle> circleList=new ArrayList<Circle>();
//        circleList.add(c1);
//        System.out.printf("Radius of %d circle is %.2f: \n",1,circleList.get(0).getRadius());
//
//
//        for(int i=1;i<5;i++) {
//            circleList.add(new Circle(4,5,6));
//            circleList.get(i).setRadius(i);
//            circleList.get(i).setX(Math.random()*5);
//            circleList.get(i).setY(Math.random()*5);
//        }
//
//        System.out.println("---Begin to print the circle list---");
//        for(int i=0;i<5;i++) {
//            System.out.printf("The area of %d circle is %.2f\n", i+1, circleList.get(i).area());
//            System.out.printf("The perimeter is %.2f\n", circleList.get(i).perimeter());
//        }
//    }
//}
public class CircleTest {
    public static void main(String[] args) {
        for(int i=0;i<5;i++) {
            Circle c1 = new Circle(i);
            Circle c2 = new Circle(i, Math.random()*5, Math.random()*5);
            System.out.println(Circle.cnt);
        }
    }
}