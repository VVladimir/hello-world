package org.stepik.lesson;

/**
 * бесконечность  + 1 = бесконечность
 * 1 / бесконечность = 0
 */
public class DoubleFloat {
    public static void main(String[] args) {
        System.out.println("Double");
        double positiveInfinity = 1.0 / 0.0;  // нет ошибки
        double negativeInfinity = -1.0 / 0.0;  // нет ошибки
        double nan = 0.0 / 0.0; // NaN - вроде число, но значение не определено
        boolean notEqualItself = nan != nan;
        System.out.println(positiveInfinity);
        System.out.println(negativeInfinity);
        System.out.println(nan);
        System.out.println(notEqualItself);

        double a = 0.1d;
        double b = a + a + a + a + a + a + a + a + a + a;
        System.out.println(b);
        System.out.println(0x0bp3);
    }
}
