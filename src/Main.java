import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {

        if (args.length == 0 || !(args[0] instanceof String)) {
            return;
        }

        String text = args[0];
        String[] paragraphs;

        while (text.contains("\\n\\n")) {
            text = text.replaceAll("\\n\\n", "\\n");
        }

        paragraphs = text.split(Pattern.quote("\\n"));
        int[] paragraphsLength = new int[paragraphs.length];

        for (int index = 0; index < paragraphs.length; index++) {
            paragraphsLength[index] = paragraphs[index].split("\s").length;
            System.out.println(paragraphs[index]);
            System.out.println(paragraphsLength[index] + " words\n");
        }

    }
}