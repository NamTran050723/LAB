import java.util.Scanner;
class NghienCuu extends NhanVien {
    private String chuyenMon;
    private double phuCapDocHai;
    public NghienCuu() {
        this.chuyenMon = "";
        this.phuCapDocHai = 0.0;
    }
    public NghienCuu(String maNhanVien, String tenNhanVien, String trinhDo, String chuyenMon, double phuCapDocHai) {
        super(maNhanVien,tenNhanVien,trinhDo);
        this.chuyenMon = chuyenMon;
        this.phuCapDocHai = phuCapDocHai;
    }
    public String getChuyenMon() {
        return chuyenMon;
    }
    public double getPhuCapDocHai() {
        return phuCapDocHai;
    }
    @Override
    public void nhap() {
        super.nhap();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap chuyen mon: ");
        this.chuyenMon = scanner.nextLine();
        System.out.print("Nhap phu cap doc hai: ");
        this.phuCapDocHai = scanner.nextDouble();
    }
    @Override
    public void xuat() {
        super.xuat();
        System.out.println("Chuyen mon: " + this.chuyenMon + ", Phu cap doc hai: " + this.phuCapDocHai);
}
    @Override
    public double tinhLuong() {
        return getLuongCoBan() + this.phuCapDocHai;
}
}