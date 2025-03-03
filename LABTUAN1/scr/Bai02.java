import java.util.Scanner;
public class Bai02 {
    public static void main(String[] args) {
        double chieudai;
        double chieurong;
        Scanner nhap = new Scanner(System.in);
        System.out.printf("Nhap vao chieu dai HCN: ");chieudai = nhap.nextDouble();
        System.out.printf("Nhap vai chieu rong: ");chieurong = nhap.nextDouble();
        double dientich = chieudai*chieurong;
        System.out.println("Dien tich HCN = "+dientich);
    }
}
