import java.util.Scanner;

public class SimpleSwapping {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter First Number: ");
        int a = sc.nextInt();
        System.out.print("Enter Second Number: ");
        int b = sc.nextInt();

        System.out.println("Before Printing");
        System.out.println("a = " + a + "\nb = " + b);

        int temp = a;
        a = b;
        b = temp;

        System.out.println("After Printing");
        System.out.println("a = " + a + "\nb = " + b);

    }
}
