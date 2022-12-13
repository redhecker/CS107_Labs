package Class9;

public class Time2Test {

    public static void main(String[] args) {
        Time2 t1 = new Time2();
        Time2 t2 = new Time2(2);
        Time2 t3 = new Time2(21, 34);
        Time2 t4 = new Time2(12, 25, 42);
        Time2 t5 = new Time2(27, 74, 99);
        Time2 t6 = new Time2(t4);
        System.out.println(t1.toUniversalString());
        System.out.println(t2.toUniversalString());
        System.out.println(t3.toUniversalString());
        System.out.println(t4.toUniversalString());
        System.out.println(t5.toUniversalString());
        System.out.println(t6.toUniversalString());
    }
}