
import java.util.Scanner;

public class LetterFrequency 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a sentence:");
        String input = scanner.nextLine();
        scanner.close();

        boolean[] sentence = new boolean[26];
        input = input.toLowerCase();

        for (int i = 0; i < input.length(); i++) 
        {
            char ch = input.charAt(i);
            if (ch >= 'a' && ch <= 'z') 
            {
                sentence[ch - 'a'] = true;
            }
        }

        boolean allPresent = true;
        for (boolean b : sentence) 
        {
            if (!b) 
             {
                allPresent = false;
                break;
            }
        }

        if (allPresent) 
        {
            System.out.println("yes");
        } 
        else {
            System.out.println("no");
        }
    }
}

