import java.util.ArrayList;
public class App {
 public static void main(String[] args) {
    ArrayList <String> arrayListString = new ArrayList<>();
    arrayListString.add ("phan tu 1");
    arrayListString.add ("phan tu 2");
    arrayListString.add ("phan tu 3");
System.out.println("cac phan tu trong arrayListString la: ");
for (int i=0; i < arrayListString.size(); i++) {
    System.out.print(arrayListString.get(i) +  "\t");
}
System.out.println("cac phan tu cua arrayListString moi la: ");
}
}