import java.util.Scanner;
public class AppSV {
    public static void main(String[] args) throws Exception {
    }
}
class Sinhvien {
    String MaSinhVien;
    String HoTen;
    Boolean gioiTinh;
    String Diachi;
    String NgaySinh;

    void nhapMaSinhVien() {
        System.out.println("Hay nhap Ma Sinh Vien ");
        Scanner sc = new Scanner(System.in);
        MaSinhVien = sc.nextLine();
    }
    void nhapHoTen() {
        System.out.println("Hay nhap Ho Ten ");
        Scanner sc = new Scanner(System.in);
        HoTen = sc.nextLine();
    }
    void nhapgioiTinh() {
        System.out.println("Hay nhap gioi tinh ");
        Scanner sc = new Scanner(System.in);
        gioiTinh = sc.nextBoolean();
    }
    void nhapDiaChi() {
        System.out.println("Hay nhap Dia chi  ");
        Scanner sc = new Scanner(System.in);
        Diachi = sc.nextLine();
    }
    void nhapNgaysinh() {
        System.out.println("Hay nhap ngay sinh  ");
        Scanner sc = new Scanner(System.in);
        NgaySinh = sc.nextLine();
    }

    void inMaSinhVien() {
        System.out.println("Ma sinh vien cua ban la " + MaSinhVien);
    }
    void inHoTen() {
        System.out.println("Ho ten cua ban la " + HoTen);
    }
    void ingioiTinh() {
        System.out.println("Gioi tinh cua ban la " + gioiTinh);
    }
    void inDiaChi() {
        System.out.println("Dia chi cua ban la " + Diachi);
    }
    void inNgaySinh() {
        System.out.println("Ngay sinh cua ban la " + NgaySinh);
    }
}