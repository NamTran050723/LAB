package KeThua;
import java.util.Scanner;
class HinhVuong extends HinhChuNhat{

    public HinhVuong(){
        ten="Hinh vuong";
    }
    public void nhapCanh(){
        Scanner nhap = new Scanner(System.in);
        System.out.println("Nhap canh: ");
        chieuDai=nhap.nextFloat();
        chieuRong=chieuDai;
    }
}