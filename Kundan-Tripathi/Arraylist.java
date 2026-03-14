import java.util.ArrayList;
import java.util.HashMap;

public class Arraylist{
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(350);

        System.out.println(list.size()); 
         System.out.println(list.contains(350)); 

        HashMap<String, String> obj = new HashMap<>();
        obj.put("name", "Kundan");
        obj.put("price", "5036");
        
         System.out.println(obj.get("price")); 
         System.out.println(obj.get("name"));
        
    }
}