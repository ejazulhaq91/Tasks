import java.util.Scanner;
public class palindrome {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter A Sting or Number: ");
        String text = sc.nextLine();

        String reversed = "";

        for(int i = text.length()-1; i >= 0; i--)
        {
            reversed = reversed + text.charAt(i);
        }

        if (reversed.equals(text))
            System.out.println("Given String is a Palindrome!");
        else
            System.out.println("Given String is not a Palindrome!");

    }







}
