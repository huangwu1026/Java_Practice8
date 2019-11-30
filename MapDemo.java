package Demo;

import java.util.HashMap;
import java.util.Map;

public class MapDemo {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("学校", "西工院");
        map.put("地理位置", "西安");
        map.put("建校时间", "1988");
        for(Map.Entry<String, String> entry  :  map.entrySet()){
            System.out.println(entry.getKey() + "--->" + entry.getValue());
        }
        System.out.println(map.size());
        System.out.println(map.isEmpty());
        System.out.println(map.getOrDefault("学校", "西工院"));
        System.out.println("----------");
        map.put("学校", "陕科大");
        map.put("在校人数", "20000");
        for(Map.Entry<String, String> entry  :  map.entrySet()){
            System.out.println(entry.getKey() + "--->" + entry.getValue());
        }
        System.out.println(map.size());
        System.out.println(map.isEmpty());
    }
}
