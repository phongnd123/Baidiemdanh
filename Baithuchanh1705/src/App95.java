import java.util.LinkedHashMap;

public class App95{
    public static void main(String[] args) {
        LinkedHashMap<Integer,String> linkedHashMap = new LinkedHashMap<>(Integer,String);
        linkedHashMap.put(1, "Java"); 
        linkedHashMap.put(2, "C++"); 
        linkedHashMap.put(3, "PHP"); 
        linkedHashMap.put(4, "Python"); 
        System.out.println("Befor remove:");
        show(linkedHashMap);
        linkedHashMap.remove(2);
        System.out.println("apter remove");
        show(linkedHashMap);

    }
}