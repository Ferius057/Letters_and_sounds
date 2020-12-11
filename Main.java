import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        while (true) {
            Scanner scanner = new Scanner(System.in);
            StringBuilder sb = new StringBuilder();
            String[] vowel = {"а", "у", "о", "ы", "и", "э", "я", "ю", "ё", "е"};
            String[] letters = {"е", "ё", "ю", "я"};
            String[] wordTrue = {"ь", "ъ"};
            String i = "";
            int count = 0;
            System.out.print("Введи слово: ");
            String word = scanner.nextLine();
            word = word.replace(" ", "").toLowerCase();
            for (int p = 0; p < word.length(); p++) {
                String let = String.valueOf(word.charAt(p));
                if (p != 0) i = String.valueOf(word.charAt(p - 1));
                if (Arrays.toString(letters).contains(let)) {
                    boolean o = String.valueOf(word.indexOf(let)).equals("0");
                    boolean j = Arrays.toString(wordTrue).contains(i);
                    boolean k = Arrays.toString(vowel).contains(i);
                    if (o || j || k) {
                        count = count + 2;
                        sb.append("\nБуква \"").append(let).append("\" дала 2 звука.");
                    } else count = count + 1;
                } else if (i.equals(let))
                    sb.append("\nДве буквы \"").append(let).append("\" стояли подряд и дали 1 звук.");
                else if (Arrays.toString(wordTrue).contains(let))
                    sb.append("\nБуква \"").append(let).append("\" не имеет звука.");
                else count = count + 1;
            }
            sb.append("\n--------------------------------------");
            sb.append("\nБукв в слове: ").append(word.length()).append(".");
            sb.append("\nЗвуков в слове: ").append(count).append(".");
            System.out.println(sb.toString() + "\n\n\n");
        }
    }
}
