import java.util.Scanner;
class NhanVien extends ConNguoi{
    private double luong;
    private String ngayNhanViec;
    private PhongKhoaBan phongKhoaBan;

    public NhanVien() {
        super();
        this.luong = 0.0;
        this.ngayNhanViec = null;
        this.phongKhoaBan = null;
    }

    public NhanVien(String hoTen, int namSinh, double luong, String ngayNhanViec, PhongKhoaBan phongKhoaBan) {
        super(hoTen, namSinh);
        this.luong = luong;
        this.ngayNhanViec = ngayNhanViec;
        this.phongKhoaBan = phongKhoaBan;
    }
    public double getLuong(){
        return luong;
    }
    public void setLuong(double luong){
        this.luong = luong;
    }
    public String getNgayNhanViec(){
        return ngayNhanViec;
    }

 public void setNgayNhanViec(String ngayNhanViec){
        this.ngayNhanViec = ngayNhanViec;
    }
    public PhongKhoaBan getPhongKhoaBan(){
        return phongKhoaBan;
    }
    @Override
    public void nhap(){
        super.nhap();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap luong: ");
        this.luong = scanner.nextDouble();
        scanner.nextLine();
        System.out.print("Nhap ngay nhan viec: ");
        this.ngayNhanViec = scanner.nextLine();
        System.out.print("Nhap phong khoa ban: ");
        String tenPhong = scanner.nextLine();
        this.phongKhoaBan = new PhongKhoaBan(tenPhong);
    }
    @Override
    public void xuat(){
        super.xuat();
        System.out.println("Luong: " + this.luong);
        System.out.println("Ngay nhan viec: " + this.ngayNhanViec);
        System.out.println("Phong khoa ban: " + this.phongKhoaBan);
    }
}
