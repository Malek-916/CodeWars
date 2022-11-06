import java.util.Scanner;

public class LetterSwap {

    public static void main(String[] args) {

        LetterSwap letterSwap = new LetterSwap();
        System.out.println("Hey fellow warriors");
        System.out.println(letterSwap.spinWords("Hey fellow warriors"));

    }

    public String spinWords(String input) {
        String[] wordsList = input.split(" ");
        String swappedString = "";
// loop on words array
        for (int i = 0; i < wordsList.length; i++) {
            String currentWord = wordsList[i];
// word with 5 or more letters get swapped
            if (currentWord.length() >= 5)
                swappedString += inverseWord(currentWord) + " ";
        else
            swappedString += currentWord + " ";
        }
        return swappedString.substring(0, swappedString.length() - 1);
    }

    public String inverseWord(String currentWord) {
        // sentence --> words ---> word --> char array
        char[] lettersList = currentWord.toCharArray();
        String swappedString = "";
        // Swap action
        for (int i1 = currentWord.length() - 1; i1 >= 0; i1--) {
            char temp = lettersList[i1];
            swappedString += temp;
        }
        return swappedString;
    }
}