import java.util.LinkedList;
import java.util.Queue;
public class QueueTask
{
    public static void main(String[] args) {

        Queue<Integer> q1 = new LinkedList<>();
        for (int i = 0; i<5; i++)
        {
            q1.add(i);
        }
        System.out.println(q1);
    }



}
