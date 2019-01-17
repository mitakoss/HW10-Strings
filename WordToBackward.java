/*
Напишете метод, който приема като вход низ и
връща низа, изписан наобратно.
Пример:
backwards("Chocolate") -> "etalocohC"
 */

public class WordToBackward{
    public static void main(String[] args) {
        String text = "Chocolate";
        String backwards = backwardWord(text);
        System.out.println(backwards);
    }

    private static String backwardWord(String text){
        StringBuilder sb = new StringBuilder();

        for (int i = text.length() - 1; i >= 0; i--) {
            sb.append(text.charAt(i));
        }
        return sb.toString();
    }
}