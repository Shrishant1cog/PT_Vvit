import java.util.HashMap;
public class hashdemomap{
    public static void main(String args [])
    {
        HashMap<String,Integer> scores  = new HashMap<String ,Integer>();
        scores.put("Sharmila",85);
        scores.put("Bala",20);
        scores.put("Fahad",12);
        scores.put("Fahad",13);
        System.out.println(scores);
        if(scores.containsKey("Fahad")){
            System.out.println("Fahad is present");

        }
    }
}