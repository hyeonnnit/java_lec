package ex.ex14;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class StreamEx01 {
    public static void main(String[] args) {
        Map<String, Object> data = new HashMap<>();
        data.put("name", "홍길동");
        data.put("age", 20);
        Map<String, Object> data2 = new HashMap<>();
        data.put("name", "장보고");
        data.put("age", 15);
        Map<String, Object> data3 = new HashMap<>();
        data.put("name", "이순신");
        data.put("age", 30);

        List<Map<String, Object>> arr = Arrays.asList(data, data2, data3);
        List<Map<String, Object>> newArr = arr.stream().map(d -> {
            int newAge = (Integer) d.get("age") - 1;
            d.put("age", newAge);
            return d;
        }).toList();
        newArr.stream().forEach(d -> {
            System.out.println(d.get("age"));
        });
    }
}
