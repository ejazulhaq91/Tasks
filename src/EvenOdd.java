import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Any Number: ");
        int number = sc.nextInt();
        if(number % 2 == 0)
            System.out.println(number + " Is Even Number");
        else
            System.out.println(number + " Is Odd Number");
    }
}
