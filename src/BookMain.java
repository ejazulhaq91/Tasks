import java.util.Scanner;

public class BookMain {
    public static void main(String[] args) {
        Scanner myObj= new Scanner(System.in);
        System.out.println("Enter Fiction Book: ");
        String fbTitle= myObj.nextLine();
        System.out.println("Enter Non-Fiction Book: ");
        String nfbTitle= myObj.nextLine();
        Fiction fb = new Fiction(fbTitle);
        double FBPrice = fb.getPrice();
        String FBTitle = fb.getTitle();
        NonFiction nfb = new NonFiction(nfbTitle);
        double NFBPrice = nfb.getPrice();
        String NFBTitle = nfb.getTitle();
        System.out.println("Title-" + FBTitle + " Cost-$" + FBPrice);
        System.out.println("Title-" + NFBTitle + " Cost-$" + NFBPrice);
    }
}
