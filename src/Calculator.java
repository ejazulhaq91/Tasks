import java.util.Scanner;
public class Calculator {
    Scanner sc = new Scanner(System.in);

    public int sum(int firstNumber)
    {
        int secondNumber = sc.nextInt();
        int sum = firstNumber + secondNumber;
        System.out.println(firstNumber + "+" + secondNumber + " = " + sum);
        return sum;
    }

    public int subtract(int firstNumber) {
        int secondNumber = sc.nextInt();
        int difference = firstNumber - secondNumber;
        System.out.println(firstNumber + " - " + secondNumber + " = " + difference);
        return difference;
    }

    public String Backspace(String s) {

        String str = sc.nextLine();
        int stringLength = str.length();
        String temp = str.substring(0, stringLength - 1);
        System.out.println("After deleting last variable: " + temp);
        return temp;
    }
}
