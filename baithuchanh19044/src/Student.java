import java.util.Scanner;
public class Student extends Person {
    public String MaSinhVien;
    public String HoTen;
public Student(){}
    public void nhapMaSinhVien() {
        System.out.println("Hay nhap Ma Sinh Vien ");
        Scanner sc = new Scanner(System.in);
        MaSinhVien = sc.nextLine();
}
    public void nhapHoTen() {
    System.out.println("Hay nhap Ho Ten ");
    Scanner sc = new Scanner(System.in);
    HoTen = sc.nextLine();
    }
    public void inMaSinhVien() {
    System.out.println("Ma sinh vien cua ban la " + MaSinhVien);
}
    public void inHoTen() {
    System.out.println("Ho ten cua ban la " + HoTen);
   }
}

    