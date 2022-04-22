package org.stepik.lesson;

import java.util.stream.IntStream;

public class Lesson2_3step8 {
    public static void main(String[] args) {

        System.out.println("yes");
    // при сложении char они кастуются в int
        System.out.println('A' + '1' + "2");
        System.out.println("A" + 12);
        System.out.println("A" + ('\t' + '\u0003'));
        System.out.println('A' + "12");
        String source = "Madam, I'm Adam!";
        System.out.println(source);
        boolean palindrome = isPalindrome(source);
        System.out.println(palindrome);


    }

    public static boolean isPalindrome(String text) {
        String all = text.replaceAll("[^A-Za-z1-9]+", "");
        StringBuilder nStr = new StringBuilder(all);
        StringBuilder reverse = nStr.reverse();
        return (all.equalsIgnoreCase(reverse.toString())) ? true : false;
    }
}
