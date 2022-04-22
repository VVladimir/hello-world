package org.stepik.lesson;

import static java.lang.Math.abs;
import static java.lang.Math.sqrt;

/**
 * 2.2 ПРеализуйте метод, проверяющий, является ли заданное число по абсолютной величине степенью двойки.
 * <p>
 * Решать можно разными способами:
 * <p>
 * воспользовавшись одним удобным статическим методом из класса java.lang.Integer;
 * применив пару трюков из двоичной арифметики;
 * написав решение "в лоб" с циклом и условными операторами (можете вернуться к этой задаче после просмотра соответствующих уроков).
 */
public class Step9 {
    public static void main(String[] args) {
        System.out.println("yst");
        boolean powerOfTwo = isPowerOfTwo(-2);
        System.out.println(powerOfTwo);

        double x1 = 32;
        double x2 = 3;
        double x3 = 0.25;
        double x4 = 88.675;
        int b = (int) sqrt(x1);
        double c = sqrt(x1);
        if (b == c)
            System.out.println("equals b & c");

        System.out.println();
        System.out.printf("sqrt(%.3f) = %.3f%n", x1, sqrt(x1));
        System.out.printf("sqrt(%.3f) = %.3f%n", x2, sqrt(x2));
        System.out.printf("sqrt(%.3f) = %.3f%n", x3, sqrt(x3));
        System.out.printf("sqrt(%.3f) = %.3f%n", x4, sqrt(x4));
    }

    /**
     * Checks if given <code>value</code> is a power of two.
     *
     * @param value any number
     * @return <code>true</code> when <code>value</code> is power of two, <code>false</code> otherwise
     */
    public static boolean isPowerOfTwo(int value) {
        value = Math.abs(value);
        return (value & (value - 1)) == 0;
    }
}
