import java.util.Scanner;
class PhongKhoaBan {
    private String maPhongKhoaBan;
    private String tenPhongKhoaBan;
    public PhongKhoaBan() {
        this.maPhongKhoaBan = "";
        this.tenPhongKhoaBan = "";
    }
    public PhongKhoaBan(String maPhongKhoaBan, String tenPhongKhoaBan) {
        this.maPhongKhoaBan=maPhongKhoaBan;
        this.tenPhongKhoaBan=tenPhongKhoaBan;
    }
    public PhongKhoaBan(String tenPhongKhoaBan){
        this.tenPhongKhoaBan=tenPhongKhoaBan;
    }

    public String getMaPhongKhoaBan() {
        return maPhongKhoaBan;
    }
    public void setMaPhongKhoaBan(String maPhongKhoaBan) {
        this.maPhongKhoaBan=maPhongKhoaBan;
    }
    public String getTenPhongKhoaBan() {
        return tenPhongKhoaBan;
    }
    public void setTenPhongKhoaBan(String tenPhongKhoaBan) {
        this.tenPhongKhoaBan=tenPhongKhoaBan;
    }
    public void nhap() {
        System.out.println("Nhap ten phong khoa ban: ");
        Scanner nhap = new Scanner(System.in);
        this.tenPhongKhoaBan = nhap.nextLine();
        System.out.println("Nhap ma phong khoa ban: ");
        this.maPhongKhoaBan = nhap.nextLine();
    }
    public void xuat() {
        System.out.println("Ten phong khoa ban: " + this.tenPhongKhoaBan);
        System.out.println("Ma phong khoa ban: " + this.maPhongKhoaBan);
    }
}