package org.stepik.lesson;

/**
 * 2.2 Преобразование типов
 * Реализуйте метод, который возвращает букву,
 * стоящую в таблице UNICODE после символа "\" (обратный слэш) на расстоянии a.
 * bite, при арифм. операциях приводятся к типу int.
 * если в арифм. операции участвуют разные типы, то они приводятся к большему типу
 */
public class Step2_2 {
    public static void main(String[] args) {
        System.out.println("");
        char c = charExpression(100);
        System.out.println(c);
    }
    public static char charExpression(int a) {
        return (char) ('\\' + a);
    }
}
