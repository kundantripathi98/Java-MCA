import java.util.HashMap;

public class Find_non_repeating_character{
    public static void main(String[] args) {
        String s = "aabbcddee";

        System.out.println(count(s));
        
    }

    public static Character count(String s){
        HashMap<Character, Integer> map = new HashMap<>();
        Character finalChar = null;
        for(int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            int count = 1;

            if(!map.containsKey(c)){
                map.put(c, count);
            } else{
                map.put(c, map.get(c)+1);
            }
        }

        for(int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            if (map.get(c).equals(1)) {
                finalChar = c;
                break;
            }
            
        }

        return finalChar;
    }
}