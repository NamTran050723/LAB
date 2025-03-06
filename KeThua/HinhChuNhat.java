package HinhHoc;
import java.util.Scanner;

class HinhChuNhat extends HinhHoc{
    public float chieuDai;
    public float chieuRong;

    public HinhChuNhat(){
        ten="Hinh chu nhat";
        this.chieuDai = 0;
        this.chieuRong = 0;
    }
    public void nhapChieuDai(){
        Scanner nhap = new Scanner(System.in);
        System.out.println("Nhap chieu dai: ");
        this.chieuDai = nhap.nextFloat();
    }
    public void nhapChieuRong(){
        Scanner nhap = new Scanner(System.in);
        System.out.println("Nhap chieu rong: ");
        this.chieuRong = nhap.nextFloat();
    }
    public void tinhChuVi(){
        chuVi = (chieuDai + chieuRong) * 2;
    }
    public void tinhDienTich(){
        dienTich = chieuDai * chieuRong;
    }
}
