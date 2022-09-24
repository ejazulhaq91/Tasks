import java.util.*;
import java.util.stream.Collectors;
import java.util.Collections;


public class Countries {
    public static void main(String[] args) {
        List<String> country = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Country Name: ");
        for(int i=0; i<7; i++)
        {
            country.add(sc.nextLine());
        }
        Iterator itr = country.iterator();
        while (itr.hasNext())
        {
            System.out.println(itr.next());
        }




        List<String> country1=(country.stream().filter((e)->e.charAt(0)=='A').map((e)->e)).collect(Collectors.toList());


        Iterator itr1 = country1.iterator();
        while (itr1.hasNext())
        {
            System.out.println(itr1.next());
        }

    }
}
