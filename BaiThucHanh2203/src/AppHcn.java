import java.util.Scanner;
public class AppHcn {
    public static void main(String[] args) throws Exception {
    }
}
class Hinhchunhat {
    float chieudai;
    float chieurong;
    float chuvi;
    float dientich;
    void nhapchieudai() {
        System.out.println("Hay nhap chieu dai cua hinh chu nhat");
        Scanner sc = new Scanner(System.in);
        chieudai = sc.nextFloat();
    }
    void nhapchieurong() {
        System.out.println("Hay nhap chieu rong cua hinh chu nhat");
        Scanner sc = new Scanner(System.in);
        chieurong = sc.nextFloat();
    }
    void tinhChuvi() {
        chuvi = 2 * (chieudai + chieurong);
    }
    void tinhDienTich() {
        dientich = chieudai * chieurong;
    }
    void inChuvi() {
        System.out.println("Chu vi Hinh Chu Nhat : " + chuvi);
    }
    void inDientich() {
        System.out.println("Dien tich Hinh Chu Nhat : " + dientich);
    }

}