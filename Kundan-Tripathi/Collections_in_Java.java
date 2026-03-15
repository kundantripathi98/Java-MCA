import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class Collections_in_Java{
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(5);
        // list.add(10);
        // list.add(20);
        // list.add(350);
        System.out.println(list.size()); 
        //  System.out.println(list.contains(350)); 

        HashMap<String, String> obj = new HashMap<>();
        obj.put("name", "Kundan");
        obj.put("price", "5036");
        //  System.out.println(obj.get("price")); 
        //  System.out.println(obj.get("name"));
        //  System.out.println(obj.containsKey("name"));

        HashSet<Integer> set = new HashSet<>();
        set.add(5);
        set.add(9);
        set.add(5);
        // System.out.println(set.size());
        
    }
}