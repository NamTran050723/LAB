import java.util.Scanner;

class Bai02 {
    private double chieuDai;
    private double chieuRong;
    public Bai02(double chieuDai, double chieuRong) {
        this.chieuDai = chieuDai;
        this.chieuRong = chieuRong;
    }
    public double getChieuDai() {
        return chieuDai;
    }
    public void setChieuDai(double chieuDai) {
        this.chieuDai = chieuDai;
    }
    public double getChieuRong() {
        return chieuRong;
    }
    public void setChieuRong(double chieuRong) {
        this.chieuRong = chieuRong;
    }
    public void tinhDienTich() {
        double dienTich = chieuDai * chieuRong;
        System.out.println("Dien tich hinh chu nhat la: " + dienTich);
    }
    public void tinhChuVi() {
        double chuvi = (chieuDai + chieuRong) * 2;
        System.out.println("Chu vi hinh chu nhat la: " + chuvi);
    }
    @Override
    public String toString() {
        return "HinhChuNhat{" +"\n"+
                "chieuDai=" + chieuDai +"\n"+
                ", chieuRong=" + chieuRong +" \n"+
                "}";
    }
    public static void main(String[] args) {
        Scanner nhap = new Scanner(System.in);
        System.out.print("Nhap chieu dai: ");
        double chieuDai = nhap.nextDouble();
        System.out.print("Nhap chieu rong: ");
        double chieuRong = nhap.nextDouble();
        Bai02 hcn = new Bai02(chieuDai, chieuRong);
        hcn.tinhDienTich();
        hcn.tinhChuVi();
    }
}