    import java.util.ArrayList;
import java.util.Scanner;

public class App110 {
    public static void main(String[] args) {
    ArrayList<Integer> arrListInteger = new ArrayList<>();
    Scanner scanner =new Scanner(System.in);
    int number;
    System.out.println("nhap so phan tu cua ArrayList: ");
    int n = scanner.nextInt();
    for (int i=0;i<n;i++){
        System.out.println("nhap phan tu thu" +i + ": ");
        number = scanner.nextInt();
        arrListInteger.add(number);
    }
    int max = arrListInteger.get(0);
    for (int i=1; i < arrListInteger.size();i++){
        if (arrListInteger.get(i).compareTo(max) > 0){
            max = arrListInteger.get(i);
        }
    }
    System.out.println("phan tu lon nhat trong arrListInteger = " + max );
    System.out.print("Xoa cac phan tu co gia tri bang: ");
    int x = sc.nextInt();
    for (int i = 0; i < a.size(); i++){
        if(a.get(i) == x){
            a.remove(i);
        }
    }
    System.out.println("List sau khi xoa:");
    for (int i = 0; i < a.size(); i++){
        System.out.print(a.get(i) + " ");
    }
    System.out.println("");
    System.out.print("List sau khi sap xep: ");
    for (int i = 0; i < a.size()-1; i++){
        for (int j = i+1; i < a.size(); j++){
            if (a.get(i) > a.get(j)){
                int temp = a.get(i);
                a.set(i, a.get(j));
                a.set(j, temp);
            }
        }
    }
    System.out.print("List sau khi sap xep: ");
    for (int i = 0; i < a.size(); i ++){
        System.out.print(a.get(i) + " ");
    }
}  
}