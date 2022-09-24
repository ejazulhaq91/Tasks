import java.util.Scanner;

public class VowelsTernary {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Character: ");
        char ch = sc.next().charAt(0);


        String result = (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') ? ch+" is a vowel" : ch+" is a consonant";
        System.out.println(result);



    }
}
