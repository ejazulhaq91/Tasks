import java.util.Arrays;
import java.util.Scanner;
public class Anagram {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("String 1: ");
        String str1 = sc.nextLine().toLowerCase();
        System.out.println("String 1: ");
        String str2 = sc.nextLine().toLowerCase();

        if(str1.length() == str2.length())
        {
            char[] ch1 = str1.toCharArray();
            char[] ch2 = str2.toCharArray();

            Arrays.sort(ch1);
            Arrays.sort(ch2);
            boolean result = Arrays.equals(ch1,ch2);

            if (result)
                System.out.println(str1 + " and " + str2 + " are Anagram");
            else
                System.out.println(str1 + " and " + str2 + " are not Anagram");
        }
        else
            System.out.println(str1 + " and " + str2 + " are not Anagram");
    }
}
