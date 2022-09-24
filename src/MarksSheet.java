import java.util.Scanner;

public class MarksSheet {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);

        System.out.print("Enter English Marks: ");
        int English = sc.nextInt();
        System.out.print("Enter Mathematics Marks: ");
        int Maths = sc.nextInt();
        System.out.print("Enter Biology Marks: ");
        int Biology = sc.nextInt();
        System.out.print("Enter Physics Marks: ");
        int Physics = sc.nextInt();
        System.out.print("Enter Chemistry Marks: ");
        int Chemistry = sc.nextInt();

        System.out.println("Subjects   \t\tTotal\tObtained");
        System.out.println("English:    \t100\t\t" +English);
        System.out.println("Mathematics: \t100\t\t" +Maths);
        System.out.println("Biology:      \t100\t\t" +Biology);
        System.out.println("Physics:       \t100\t\t" +Physics);
        System.out.println("Chemistry:      100\t\t" +Chemistry);
        System.out.println("****************************************");
        int Total = English + Maths + Biology + Physics + Chemistry;
        System.out.println("Total       \t500\t\t" +Total );
    }
}
