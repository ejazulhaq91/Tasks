import java.util.Scanner;
public class Vowels {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Character: ");
        String ch = sc.next().toLowerCase();

        switch (ch)
        {
            case "a":
            case "e":
            case "i":
            case "o":
            case "u":
                System.out.println(ch + " is a Vowel!");
                break;
            default:
                System.out.println(ch + " is Consonant");
        }
    }
}
