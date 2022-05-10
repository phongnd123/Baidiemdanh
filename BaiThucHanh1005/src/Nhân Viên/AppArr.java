package NhanVien;
    import java.util.ArrayList;
public class AppArr{
    public static void main(String[] args){
        ArrayList<nhanvien> nhanvien = new ArrayList<>();
        nhanvien.add(nhanvienA);
        nhanvien.add(nhanvienB);
        nhanvien.add(nhanvienC);
        nhanvien.remove(nhanvienB);
        nhanvien.set(nhanvienA,nhanvienD);
        showList(nhanvien);

    }  
}
