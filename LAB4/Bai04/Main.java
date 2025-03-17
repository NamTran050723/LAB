import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        HangDienMay dienMay = new HangDienMay("DM001","Tivi",5000000,12,220,100);
        System.out.println("---Nhap thong tin hang dien may:");
        dienMay.nhap();
        dienMay.xuat();
        System.out.println("---Nhap thong tin hang thuc pham:");
        HangThucPham thucPham = new HangThucPham("TP001","Gao",20000,"01/03/2025","01/09/2025");
        thucPham.nhap();
        thucPham.xuat();
    }
}
