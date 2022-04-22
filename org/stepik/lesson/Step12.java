package org.stepik.lesson;

/**
 * Реализуйте метод, возвращающий ответ на вопрос: правда ли, что a + b = c?
 * Допустимая погрешность – 0.0001 (1E-4)
 */
public class Step12 {
    public static void main(String[] args) {
        System.out.println( doubleExpression(0.1d, 0.2d, 0.3d));
    }
    public static boolean doubleExpression(double a, double b, double c) {
        return -0.0001d < (a + b -c) && (a + b -c) < 0.0001d;
    }
}
