package bookEx.bookEx13;

import java.util.HashMap;
import java.util.Map;

public class MapTest {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<String, String>();
        map.put("Kim","1234");
        map.put("Park","pass");
        map.put("Lee","word");

        System.out.println(map.get("Lee"));
        for (String key: map.keySet()){
            String value = map.get(key);
            System.out.println("key="+key+ ", value" + value);
        }
        map.remove(3);
        map.put("Choi", "password");
        System.out.println(map);
    }
}
