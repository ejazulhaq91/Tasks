import java.util.Scanner;

public class PrimeNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Any Number: ");
        int number = sc.nextInt();
        int counter = 0;
        for(int i=1; i<number; i++)
        {
            if(number == 2)
                break;
            else if (number % i ==0)
                counter++;
        }
        if(counter<2)
            System.out.println(number + " Is Prime");
        else
            System.out.println(number + " Is Not Prime");
    }
}
