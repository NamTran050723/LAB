package KeThua;
import java.util.Scanner;
class HinhTru extends HinhTron{
    public float chieuCao;

    public HinhTru(){
        ten="Hinh tru";
    }
    public void nhapChieuCao(float chieuCao){
        this.chieuCao=chieuCao;
        Scanner nhap = new Scanner(System.in);
        System.out.println("Nhap chieu cao: ");
        chieuCao=nhap.nextFloat();
    }
    public void tinhTheTich(){
        theTich=banKinh*banKinh*chieuCao*Pi;
    }
}