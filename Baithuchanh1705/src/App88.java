import java.util.HashMap;

public class App88 {
     public static void main(String[] args) {
        HashMap<String,String> hashMapCity = new HashMap<>();
        hashMapCity.put("Qng", "Quang Ngai" );
        hashMapCity.put("QN", "Quang Nam" );
        hashMapCity.put("QN", "Quang Ninh");
        hashMapCity.put("HCM","thanh pho Ho Chi Minh");
        System.out.println("Danh sach cac thanh pho trong hashMapCity: ");
        Set<Map.Entry<String,String>> setCity = hashMapCity.entrySet();
        System.out.println(setCity);
        System.out.println("Qng" + hashMapCity.get("Qng "));
        System.out.println("NT: " + hashMapCity.get("NT"));
        if (hashMapCity.containsKey("thanh pho Ho Chi Minh")){
            System.out.println("Co thanh pho Ho Chi Minh trong hashMapCity");
        }

    }
}