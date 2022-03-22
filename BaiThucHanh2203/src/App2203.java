public class App2203 {
    public static void main(String[] args) throws Exception {
        System.out.println(" Class hình chữ nhật ");
        Hinhchunhat hcn = new Hinhchunhat();
        hcn.nhapchieudai();
        hcn.nhapchieurong();
        hcn.tinhChuvi();
        hcn.tinhDienTich();
        hcn.inChuvi();
        hcn.inDientich();
        System.out.println("");

        System.out.println("Class person ");
        Person ps = new Person();
        ps.nhapPersonID();
        ps.nhapPersonName();
        ps.nhapGender();
        ps.nhapAddress();
        ps.inPersonID();
        ps.inPersonName();
        ps.inGender();
        ps.inAddress();

        System.out.println(" Class Sinhvien ");
        Sinhvien sv = new Sinhvien();
        sv.nhapMaSinhVien();
        sv.nhapHoTen();
        sv.nhapDiaChi();
        sv.nhapgioiTinh();
        sv.nhapNgaysinh();
        sv.inMaSinhVien();
        sv.inHoTen();
        sv.inDiaChi();
        sv.ingioiTinh();
        sv.inNgaySinh();

        System.out.println(" Class giaiphuongtrinhbachai ");
        PhuongTrinhBacHai ptb2 = new PhuongTrinhBacHai();
        ptb2.nhapa();
        ptb2.nhapb();
        ptb2.nhapc();
        ptb2.tinhdelta();
        ptb2.indelta();
        ptb2.giaiptb2();

    }
}