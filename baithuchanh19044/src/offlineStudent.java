
import java.util.Scanner;
public class offlineStudnet extends Student {
    public  Boolean gioiTinh; ;
public offlineStudnet(){}
public void nhapgioiTinh() {
    System.out.println("Hay nhap gioi tinh ");
    Scanner sc = new Scanner(System.in);
    gioiTinh = sc.nextBoolean();
}
public void ingioiTinh() {
    System.out.println("Gioi tinh cua ban la " + gioiTinh);
   }  
}
