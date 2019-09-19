import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String str;
        Scanner sc = new Scanner(System.in);
        System.out.println("Input string: ");
        str = sc.nextLine();
        char character = 'a';

        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == character) {
                count++;
            }
        }
        System.out.println("Number of occurrences of character " + character + " is: " + count);
    }
}



