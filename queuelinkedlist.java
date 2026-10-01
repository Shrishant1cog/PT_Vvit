import java.util.LinkedList;
import java.util.Queue;
public class queuelinkedlist {
    public static void main(String[] args) {
        Queue<String> users =  new LinkedList<String>();
        users.offer("Napoleon");
        users.offer("Hannibal ");
        users.offer("Modi");
        while(!users.isEmpty())
        {
            System.out.println(users.poll());
        }
    }
    
}
