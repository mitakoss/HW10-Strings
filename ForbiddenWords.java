/*
Даден е символен низ, съставен от няколко "заббранени" думи,
разделени със запетая. Даден е и текст, съдържащ тези думи. Да
се напише програма, която замества забранените думи в текста със
звездички.
 */
public class ForbiddenWords {
    public static void main(String[] args) {
        String text = "Microsoft announced it's next generation Java compiler today. It uses advanced parsers" +
                "and special optimizer for the Microsoft JVM.";
        String forbiddenWords = "Java, JVM, Microsoft";

        filteredText(text, forbiddenWords);
    }

    private static void filteredText(String text, String forbiddenWords) {
        String[] words = forbiddenWords.split(", ");
        String result = "";
        String temp = "";

        for (int i = 0; i <= words.length - 1; i++) {

            temp = text.replaceAll(words[i], "***");
            result = temp;
            text = temp;
        }
        System.out.println(result);
    }
}