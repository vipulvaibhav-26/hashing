import java.util.*;
public class hash_map {
    public static void main(String[] args) {
        HashMap<String,Integer> v=new HashMap<>();
        v.put("India",7);
        v.put("Austrilia",8);
        v.put("USA",9);
        System.out.println(v);
        v.get("India");
        System.out.println(v.containsKey("India"));
System.out.println(v.get("India"));
if(v.containsKey(v.get("Australia"))){
    System.out.println("key is present in the map");
}
Set<String> keys=v.keySet();
for(String key :keys){
    System.out.println(key+" "+v.get(key));
}
        }
    }
