package org.stepik.lesson;

public class Lesson2_4step10 {
    public static void main(String[] args) {
        String[] roles = {
                "Городничий", "Аммос Федорович",
                "Артемий Филиппович",
                "Лука Лукич"};
        String[] textLines = {
                "Городничий: Я пригласил вас, господа, с тем, чтобы сообщить вам пренеприятное известие: к нам едет ревизор.",
                "Аммос Федорович: Как ревизор?",
                "Артемий Филиппович: Как ревизор?",
                "Городничий: Ревизор из Петербурга, инкогнито. И еще с секретным предписаньем.",
                "Аммос Федорович: Вот те на!",
                "Артемий Филиппович: Вот не было заботы, так подай!",
                "Лука Лукич: Господи боже! еще и с секретным предписаньем!"};
        String s = printTextPerRole(roles, textLines);
        System.out.println(s);
    }

    private static String printTextPerRole(String[] roles, String[] textLines) {
        StringBuilder roleBilder = new StringBuilder();
        for (String role : roles) {
            int line = 0;
            roleBilder.append(role).append(":\n");
            for (int i = 0; i < textLines.length; i++) {
                if (textLines[i].startsWith(role+":")) {
                    roleBilder.append(i + 1).append(")").append(textLines[i].substring(role.length()+1)).append("\n");
                }
            }
            roleBilder.append("\n");
        }
        return roleBilder.toString();
    }
}
