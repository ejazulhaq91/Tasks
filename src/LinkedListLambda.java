import java.util.LinkedList;
public class LinkedListLambda {
    public static void main(String[] args) {

        LinkedList l_list = new LinkedList();

        l_list.add("Ejaz");
        l_list.add("Khan");
        l_list.add("Hamdan");
        l_list.add("Ali");
        l_list.add("Usama");
        l_list.add("Ahmad");

//        System.out.println(l_list);
//        System.out.println(l_list.get(2));
//        System.out.println(l_list.contains("Ejaz"));
//        l_list.addFirst("Hamid");
//        System.out.println(l_list);
//        l_list.addLast("Akbar");
//        System.out.println(l_list);
//        System.out.println(l_list.element());
//        System.out.println(l_list.getFirst());
//        System.out.println(l_list.getLast());
//        System.out.println(l_list.getClass());

        l_list.forEach((n)-> System.out.println(n));
    }
}
