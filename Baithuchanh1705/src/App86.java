import java.util.HashMap;

public class App86 {
     public static void main(String[] args) {
        HashMap<String,String> hashMap = new HashMap<>();
        hashMap.put("CSLT","Co so lap trinh");
        hashMap.put("C++","C++");
        hashMap.put("C#","C sharp");
        hashMap.put("Java","Java");
        Set<Map.Entry<String,String>> setHashMap = hashMap.entrySet();
        System.out.println("Cac entry co trong setHashMap: ");
        System.out.println(setHashMap);
    }
}