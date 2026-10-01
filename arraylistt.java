
import java.util.ArrayList;

public class arraylistt {
    public static void main(String[] args) {
        ArrayList<String> nameList = new ArrayList<>();
        nameList.add("Batman");
        nameList.add("Black panther ");
        nameList.add("Spiderman");  
        for(int i =0;i< nameList.size();i++)
        {
            System.out.println(nameList.get(i));
        }
    }
    
}
