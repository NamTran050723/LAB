import java.util.Scanner;
public class Demo {
    public static void main(String[] args) {
        PhanSo p1 = new PhanSo();
        p1.xuatPhanSo();
        p1.nhapPhanSo();
        p1.xuatPhanSo();
        PhanSo p2 = new PhanSo(4, 16);
        p2.xuatPhanSo();
        Scanner nhap = new Scanner(System.in);
        System.out.println("Nhap tu so cua so thu 3: ");
        int tu3 = nhap.nextInt();
        System.out.println("Nhap mau so cua so thu 3: ");
        int mau3 = nhap.nextInt();
        PhanSo p3 = new PhanSo(tu3, mau3);
        p3.xuatPhanSo();
        PhanSo congPs = p1.cong(p3);
        congPs.xuatPhanSo();
        PhanSo p4 = new PhanSo(congPs);
        p4.xuatPhanSo();
        PhanSo nhanPs = p4.nhan(p2);
        nhanPs.xuatPhanSo();
    }
}
