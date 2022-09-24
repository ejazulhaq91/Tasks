import java.util.Scanner;
public class Bank {
    String name;
    int id;
    double balance;
        Scanner sc = new Scanner(System.in);
        public void addCustomer()
    {
        System.out.print("Enter Name: ");
        name = sc.nextLine();
        System.out.print("Enter Customer ID: ");
        id = sc.nextInt();
        System.out.println("Initial Balance: ");
        balance = sc.nextDouble();
    }
        // Method for Withdrawing Money
        public void withdraw()
        {
            double amount = sc.nextDouble();
            if(amount > balance)
                System.out.println("Insufficient Balance!");
            else
            {
                balance-=amount;
                System.out.println("Rs: " + amount + " Withdrawn");
                System.out.println("Remaining Balance Is Rs: " + balance);
            }
        }
        // Method for Depositing Money
        public void deposit()
        {
            double money = sc.nextDouble();
            balance+=money;
            System.out.println("Rs: " + money + " Deposited");
            System.out.println("New Balance Is Rs: " + balance);
        }
        // Method for Checking account balance

        public void showDetails()
        {
            System.out.println("Name Of Customer: " + name);
            System.out.println("Customer ID: " + id);
            System.out.println("Account Balance: " + balance);
        }
    }
