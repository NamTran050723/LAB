package KeThua;
import java.util.Scanner;
class HinhTron extends HinhHoc{
    public float banKinh;

    public HinhTron(){
        this.ten="Hinh tron";
        this.banKinh=banKinh;
    }
    public void nhapBanKinh(float banKinh){
        this.banKinh=banKinh;
        Scanner nhap = new Scanner(System.in);
        System.out.println("Nhap ban kinh: ");
        banKinh=nhap.nextFloat();
    }
     public void tinhChuVi(){
        chuVi=2*Pi*banKinh;
    }
    public void tinhDienTich(){
        dienTich=Pi*banKinh*banKinh;
    }
}