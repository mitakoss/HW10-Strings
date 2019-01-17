/*
Напишете метод, който приема за вход два низа
и извеждаколко пъти вторият низ се среща в първия.
Пример:
wordCount("I live in BG. I am now in Vratsa", "in") -> 2
 */
public class WordCounter {
    public static void main(String[] args) {
        String text = "I live in BG. Now I am in Vratsa.";
        String searchedWord = "in";

        wordCount(text, searchedWord);
    }

    private static void wordCount(String text, String searchedWord) {
        String[] array = text.split(" ");
        int counter = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i].equals(searchedWord)){
                counter++;
            }
        }
        System.out.println(counter);
    }
}
