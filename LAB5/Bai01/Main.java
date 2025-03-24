import java.util.ArrayList;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<NhanVien> danhsacNhanVien = new ArrayList<>();
        QuanLy quanly = new QuanLy("QL001","Nguyen Van A", "Dai Hoc","Quan Tri", 2000000);
        System.out.println("---Nhap thong tin Quan Ly---");
        quanly.nhap();
        quanly.xuat();
        System.out.print("Luong: "+quanly.tinhLuong());
        NghienCuu nghienCuu = new NghienCuu("NC001","Tran Thi B","Thac Si","Hoa Hoc",1500000);
        System.out.println("\n ---Nhap Thong Tin Nghien Cuu---");
        nghienCuu.nhap();
        nghienCuu.xuat();
        System.out.println("Luong: "+nghienCuu.tinhLuong());
        PhucVu phucVu = new PhucVu("PV001","Le Van C", "Trung cap" );
        System.out.println("\n ---Nhap Thong Tin Nhan Vien---");
        phucVu.nhap();
        phucVu.xuat();
        System.out.println("Luong: "+phucVu.tinhLuong());
        danhsacNhanVien.add(quanly);
        danhsacNhanVien.add(nghienCuu);
        danhsacNhanVien.add(phucVu);
        System.out.println("\n Danh sach nhan vien: ");
        for (NhanVien nv:danhsacNhanVien){
            nv.xuat();
            System.out.println("Luong: "+nv.tinhLuong());
        }
    }
}
