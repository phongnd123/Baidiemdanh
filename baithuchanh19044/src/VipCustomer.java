
import java.util.Scanner;
public class VipCustomer extends Person{
    public String HoTen;
}
public VipCustomer(){}
public void nhapHoTen() {
    System.out.println("Hay nhap Ho Ten ");
    Scanner sc = new Scanner(System.in);
    HoTen = sc.nextLine();
    }
    public void inHoTen() {
        System.out.println("Ho ten cua ban la " + HoTen);
       }
  }