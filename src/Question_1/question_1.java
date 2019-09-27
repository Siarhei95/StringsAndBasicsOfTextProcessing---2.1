package Question_1; //Дан текст (строка). Найдите наибольшее количество подряд идущих пробелов в нем.
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class question_1 {
    public static class Main {
        public static void main(String[] args) {
            String text = "Java   is one of  the  best     programming  languages ";
            int maxSpace = 0;

            Matcher matcher = Pattern.compile("(\\s)\\1+").matcher(text);
            while (matcher.find()) {
                String num = matcher.group();

                if (num.length() > maxSpace) {
                    maxSpace = num.length();
                }
            }
            System.out.println("Maximum consecutive spaces equal: " + maxSpace);
        }
    }
}