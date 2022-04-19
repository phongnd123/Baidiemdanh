
import java.util.Scanner;
public class onlineStudnet extends Student {
public  String Diachi;

public onlineStudnet(){}
public void nhapDiaChi() {
    System.out.println("Hay nhap Dia chi  ");
    Scanner sc = new Scanner(System.in);
    Diachi = sc.nextLine();
}
public void inDiaChi() {
    System.out.println("Dia chi cua ban la " + Diachi);
}
}