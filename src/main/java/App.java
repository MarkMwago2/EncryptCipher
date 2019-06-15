import java.io.Console;

public class App {
    public static void main(String[] args) {
        Console myConsole = System.console();

        System.out.println("Welcome to Ceaser Cipher. Give me a word");
        String yourWord = myConsole.readLine();
        System.out.println("Good. Now give me a key");
    }
}
