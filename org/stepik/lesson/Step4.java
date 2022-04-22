package org.stepik.lesson;

/**
 * примитивные типы предаются по значению
 * ссылочные типы по ссылке
 * ссылки хранятся в стеке(Stack), а созданные объекты в куче(Heap).
 */
public class Step4 {
    public static void main(String[] args) {
        // копируются по значению
        int a = 5;
        int b = a;
        b++;
        System.out.println(a);
        System.out.println(b);

        // копируются по ссылке, Для строк не работает. При изменении строки, создается новая строка
        Toto aa = new Toto();
        aa.i = 1;
        Toto bb = aa;
        bb.i = 2;
        System.out.println(aa.i);
        System.out.println(bb.i);
        System.out.println(0x0bp3);


    }
}

class Toto {
    int i;

}
