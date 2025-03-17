import java.util.ArrayList;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Sach> danhSachSach = new ArrayList<Sach>();
        SachVanHoc vanHoc = new SachVanHoc("VH001","Truyen Kieu","Nguyen Du",400000,5);
        SachGiaoKhoa giaoKhoa = new SachGiaoKhoa("GK001","Toan 10","HoangXuan",250000,10,"Giao Duc");
        danhSachSach.add(vanHoc);
        danhSachSach.add(giaoKhoa);
        int luachon;
        do{
        System.out.println("-------Menu-------");
        System.out.println("1. Nhap thong tin sach");
        System.out.println("2. Thong tin sach sau khi giam gia");
        System.out.println("3. Sach co gia lon nhat sau giam gia");
        System.out.println("0. Thoat");
        System.out.print("Nhap lua chon: ");
        luachon = scanner.nextInt();
        scanner.nextLine();
        switch (luachon){
            case 1:
            System.out.println("----Nhap thong tin cho cac quyen sach: ");
            for (Sach sach:danhSachSach){
            sach.nhap();
            }
            System.out.println("Nhap thanh cong");
            break;
            case 2:
            System.out.println("Thong tin cac quyen sach sau khi giam gia: ");
            for (Sach sach:danhSachSach){
            sach.xuat();
            System.out.println("Gia sau khi giam: " + sach.getGiaSauGiam());
            }
            break;
            case 3:
            Sach sachGiaMax = danhSachSach.get(0);
            for (Sach sach: danhSachSach){
                if (sach.getGiaSauGiam()>sachGiaMax.getGiaSauGiam()){
                    sachGiaMax=sach;
                }
            }
                System.out.println(" Sach co gia lon nhat sau khi giam: ");
                sachGiaMax.xuat();
                System.out.println("Gia sau giam: "+sachGiaMax.getGiaSauGiam());
                break;
            default:
                System.out.println("Khong co lua chon hop le !");
                System.out.print("Vui long nhap lai: ");
                luachon = scanner.nextInt();
            }
        }while (luachon !=0);
    }
}
