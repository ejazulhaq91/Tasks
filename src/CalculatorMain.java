import java.util.Scanner;

public class CalculatorMain {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter First Number: ");
        int firstNumber = sc.nextInt();
        Calculator cal  = new Calculator();
        char ch;

        do {
                System.out.println("1. Press + for Addition: ");
                System.out.println("2. Press - for Subtraction: ");
                System.out.println("3. Press b for Clear Item: ");
                System.out.println("0. Press 0 for Exit: ");
                ch = sc.next().charAt(0);
                switch (ch) {
                    case '+':
                        cal.sum(firstNumber);
                        break;
                    case '-':
                        cal.subtract(firstNumber);
                        break;
                    case 'b':
                        String s = String.valueOf(firstNumber);
                        cal.Backspace(s);
                        break;
                    default :
                        System.out.println("Invalid Operator");
            }
        } while(ch != 0);
    }
}
