import java.util.Scanner;
class HangThucPham extends HangHoa{
    private String ngaySanXuat;
    private String ngayHetHan;

    public HangThucPham(){
        super();
        this.ngaySanXuat = "";
        this.ngayHetHan = "";
    }
    public HangThucPham(String maHang, String tenHang, long donGia, String ngaySanXuat, String ngayHetHan){
        super(maHang, tenHang, donGia);
        this.ngaySanXuat = ngaySanXuat;
        this.ngayHetHan = ngayHetHan;
    }
    public String getNgaySanXuat(){
        return this.ngaySanXuat;
    }
    public String getNgayHetHan(){
        return this.ngayHetHan;
    }
    public void nhap(){
        Scanner nhap = new Scanner(System.in);
        System.out.print("Nhap ngay san xuat: ");
        this.ngaySanXuat = nhap.nextLine();
        System.out.print("Nhap ngay het han: ");
        this.ngayHetHan = nhap.nextLine();
    }
    public void xuat(){
        System.out.println("---Ma Hang: " + this.getMaHang());
        System.out.println("Ten Hang: " + this.getTenHang());
        System.out.println("Don Gia: " + this.getDonGia());
        System.out.println("Ngay san xuat: " + this.ngaySanXuat);
        System.out.println("Ngay het han: " + this.ngayHetHan);
    }
}