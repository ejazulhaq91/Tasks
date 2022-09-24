import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Employee {
    public static void main(String[] args) {

        int emp_id;
        List<Integer> numbers = new ArrayList<>();
        for (int i=0; i<10; i++)
            numbers.add(i);
        System.out.println("Original List: " + numbers);

        List<Integer> num = numbers.stream().map((s)-> Integer.valueOf(s)).filter((s)-> s!=2).
                            collect(Collectors.toList());

        System.out.println("New List: " + num);

    }
}
