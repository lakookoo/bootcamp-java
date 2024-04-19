import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Hangman {

    public static String[] words = { "ant", "baboon", "badger", "bat", "bear", "beaver", "camel",
            "cat", "clam", "cobra", "cougar", "coyote", "crow", "deer",
            "dog", "donkey", "duck", "eagle", "ferret", "fox", "frog", "goat",
            "goose", "hawk", "lion", "lizard", "llama", "mole", "monkey", "moose",
            "mouse", "mule", "newt", "otter", "owl", "panda", "parrot", "pigeon",
            "python", "rabbit", "ram", "rat", "raven", "rhino", "salmon", "seal",
            "shark", "sheep", "skunk", "sloth", "snake", "spider", "stork", "swan",
            "tiger", "toad", "trout", "turkey", "turtle", "weasel", "whale", "wolf",
            "wombat", "zebra" };

    public static String[] gallows = { "+---+\n" +
            "|   |\n" +
            "    |\n" +
            "    |\n" +
            "    |\n" +
            "    |\n" +
            "=========\n",

            "+---+\n" +
                    "|   |\n" +
                    "O   |\n" +
                    "    |\n" +
                    "    |\n" +
                    "    |\n" +
                    "=========\n",

            "+---+\n" +
                    "|   |\n" +
                    "O   |\n" +
                    "|   |\n" +
                    "    |\n" +
                    "    |\n" +
                    "=========\n",

            " +---+\n" +
                    " |   |\n" +
                    " O   |\n" +
                    "/|   |\n" +
                    "     |\n" +
                    "     |\n" +
                    " =========\n",

            " +---+\n" +
                    " |   |\n" +
                    " O   |\n" +
                    "/|\\  |\n" + // if you were wondering, the only way to print '\' is with a trailing escape
                                  // character, which also happens to be '\'
                    "     |\n" +
                    "     |\n" +
                    " =========\n",

            " +---+\n" +
                    " |   |\n" +
                    " O   |\n" +
                    "/|\\  |\n" +
                    "/    |\n" +
                    "     |\n" +
                    " =========\n",

            " +---+\n" +
                    " |   |\n" +
                    " O   |\n" +
                    "/|\\  |\n" +
                    "/ \\  |\n" +
                    "     |\n" +
                    " =========\n" };

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String word = randomWord(words);
        char[] lettersArr = word.toCharArray();
        
        int length = lettersArr.length;
        int galLength = gallows.length;
        char guess;
        char[] placeholders = new char[length];
        char[] misses = new char[length];
        Arrays.fill(placeholders, '_');

        System.out.println("Welcome to Hangman game...");
        System.err.println(gallows[0]);
        System.out.print("Word: ");
        printPlaceholders(placeholders);
        System.out.println("\nMisses: ");
        System.out.print("Guess: ");
        guess = scanner.nextLine().charAt(0);
        System.out.println(guess);

        while()

        
        

    }

    public static String randomWord(String[] words){
        Random random = new Random();
        int chosen = random.nextInt(words.length);
        return words[chosen];
    }

    public static void printPlaceholders(char[] placeholders) {
        for (int i = 0; i < placeholders.length; i++) {
            System.out.print(placeholders[i] + " ");
        }
       
    }

    public static int checkGuess(char guess, char[] arrOfLetters){
        for(int i = 0; i < arrOfLetters.length; i++){
            if( arrOfLetters[i] == guess){
                return i;
            }
        }
        return -1;
    }

    public static char[] updatePlaceholders(int i, char[] placeholders, char letter){
        placeholders[i] = letter;
        return placeholders;
    }

    public static void printMissedGueses(int num, char miss){
        
        

    }



    


}
