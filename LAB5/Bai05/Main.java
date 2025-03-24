import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("---Nhap thong tin hoc vien: ");
        HocVien hocvien = new HocVien();
        hocvien.nhap();
        System.out.println("---Nhap thong tin nhan vien: ");
        NhanVien nhanvien = new NhanVien();
        nhanvien.nhap();
        System.out.println("\n ---Thong tin hoc vien: ");
        hocvien.xuat();
        System.out.println("\n---Thong tin nhan vien: ");
        nhanvien.xuat();
        scanner.close();
    }
}
