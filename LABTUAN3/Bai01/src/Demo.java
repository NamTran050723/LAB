public class Demo{
    public static void main(String[] args) {
        HocSinh hs1 = new HocSinh();
        hs1.NhapHocSinh();
        hs1.Xuat();
        HocSinh hs2 = new HocSinh(2213, "Tran Nam",7.0);
        hs2.Xuat();
        HocSinh hs3 = new HocSinh(hs2);
        hs3.Xuat();
        hs3.setHoTen("Nguyen Van Nam");
        hs3.Xuat();
        double max = hs1.getDiemTB();
        String ten = hs1.getHoTen();
        if(max<hs2.getDiemTB()){
            max = hs2.getDiemTB();
            ten = hs2.getHoTen();
        }
        if(max<hs3.getDiemTB()){
            max = hs3.getDiemTB();
            ten = hs3.getHoTen();
        }
        System.out.println("Hoc sinh co diem TB cao nhat la: " + ten + "\n" + "Diem TB: " + max);
    }
}