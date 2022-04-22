package org.stepik.lesson;

import java.math.BigInteger;
import java.util.Arrays;

/**
 * Реализуйте метод, вычисляющий факториал заданного натурального числа.
 * <p>
 * Факториал N вычисляется как 1 * 2 * ... * N.
 */
public class Lesson2_4step8 {
    public static void main(String[] args) {
        System.out.println("factorial");
        BigInteger factorial = factorial(4);
        System.out.println(factorial);

        int[] a1 = {23, 47, 81, 95};
        int[] a2 = {7, 14, 39, 55, 62, 74};

        int[] ints = mergeArrays(a1, a2);
        String s = Arrays.toString(ints);
        System.out.println(s);
    }

    public static BigInteger factorial(int value) {

        BigInteger res = new BigInteger(value + "");
        for (int i = value - 1; i != 0; i--) {
            res = res.multiply(new BigInteger(String.valueOf(i)));
        }
        return res;
    }

    /**
     * Merges two given sorted arrays into one
     *
     * @param a1 first sorted array
     * @param a2 second sorted array
     * @return new array containing all elements from a1 and a2, sorted
     */
    public static int[] mergeArrays(int[] a1, int[] a2) {
        int[] e = new int[a1.length + a2.length];
        for (int i = 0, j = 0, k = 0; k < (a1.length + a2.length); k++) {
            if (i < a1.length && j < a2.length) {
                if (a1[i] <= a2[j]) {
                    e[k] = a1[i];
                    i++;
                } else if (a2[j] <= a1[i]) {
                    e[k] = a2[j];
                    j++;
                }
            } else {
                if (i < a1.length) {
                    e[k] = a1[i];
                    i++;
                } else if (j < a2.length) {
                    e[k] = a2[j];
                    j++;
                }
            }
        }
        return e;
    }


}
