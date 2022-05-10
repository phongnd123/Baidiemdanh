public class NhanVien {
    public static void main(String[] args) throws Exception {
    }
}
class NhanVien {
    String MaNhanVien;
    String HoTen;
    String Diachi;
    String PhuongThuc;

    void nhapMaNhanVien() {
        System.out.println("Hay nhap Ma Nhan Vien ");
        Scanner sc = new Scanner(System.in);
        MaNhanVien = sc.nextLine();
    }
    void nhapHoTen() {
        System.out.println("Hay nhap Ho Ten ");
        Scanner sc = new Scanner(System.in);
        HoTen = sc.nextLine();
    }
    void nhapDiaChi() {
        System.out.println("Hay nhap Dia chi  ");
        Scanner sc = new Scanner(System.in);
        Diachi = sc.nextLine();
    }
    void nhapPhuongThuc() {
        System.out.println("Hay nhap phuong thuc ");
        Scanner sc = new Scanner(System.in);
        PhuongThuc = sc.nextBoolean();
    }
    
}
