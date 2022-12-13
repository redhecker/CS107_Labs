package Lab4;

public class Class_week4 {
    public static void main(String[] args) {
        int x=0;
        if (x==0) {
            int b = 0, c = 0;
            if (true || b == (c = 6)) {
                System.out.println(c); // what's c's value?
            }
            x=1;
        }
        if (x==1) {
            int b = 0, c = 0;
            if (true | b == (c = 6)) {
                System.out.println(c); // what's c's value?
            }
        }
    }
}
