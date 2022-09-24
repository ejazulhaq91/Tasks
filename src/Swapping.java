import java.util.Scanner;
public class Swapping {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter First Number: ");
        int a = sc.nextInt();
        System.out.print("Enter Second Number: ");
        int b = sc.nextInt();

        System.out.println("Before Printing");
        System.out.println("a = " + a + "\nb = " + b);

        a = a + b;  // a = 23, b = 12, a = a+b = 45
        b = a - b;  // b = 45-12 = 23
        a = a - b;

        System.out.println("After Printing");
        System.out.println("a = " + a + "\nb = " + b);
    }
}
