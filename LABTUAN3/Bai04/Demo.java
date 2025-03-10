import java.util.Scanner;
public class Demo {
    public static void main(String[] args){
        Scanner nhap = new Scanner(System.in);
        System.out.println("Nhap thong tin nhan vien 1: ");
        System.out.print("- Nhap ma so: ");
        int maSo1 = nhap.nextInt();
        nhap.nextLine();
        System.out.print("- Nhap ho ten: ");
        String hoTen1 = nhap.nextLine();
        System.out.print("- Nhap luong co ban: ");
        double luongCB1 = nhap.nextDouble();
        System.out.print("- Nhap he so: ");
        double heSo1 = nhap.nextDouble();
        System.out.print("- Nhap so luong: ");
        int soLuong1 = nhap.nextInt();
        NhanVien nv1 = new NhanVien(maSo1, hoTen1, luongCB1, heSo1, soLuong1);
        NhanVien nv2 = new NhanVien(125,"Tran Hoai Nam", 10000000, 2.5, 100);
        NhanVien nv3 = new NhanVien(nv2);
        System.out.println("Thong tin nhan vien 1: " );
        nv1.xuatNV();
        System.out.println("Thong tin nhan vien 2: ");
        nv2.xuatNV();
        System.out.println("Thong tin nhan vien 3: ");
        nv3.xuatNV();
        System.out.print("Nhap STT nhan vien muon doi ho ten: ");
        int stt = nhap.nextInt();
        nhap.nextLine();
        switch (stt){
            case 1:
                System.out.print("Nhap ho ten moi: ");
                String hoTenMoi = nhap.nextLine();
                nv1.setHoTen(hoTenMoi);
                break;
            case 2:
                System.out.print("Nhap ho ten moi: ");
                String hoTenMoi2 = nhap.nextLine();
                nv2.setHoTen(hoTenMoi2);
                break;
            case 3:
                System.out.print("Nhap ho ten moi: ");
                String hoTenMoi3 = nhap.nextLine();
                nv3.setHoTen(hoTenMoi3);
                break;
            default:
                System.out.println("Khong co nhan vien nao co STT nhu vay");
                break;
        }
        NhanVien max= nv1;
        if(nv2.getHeSo()>max.getHeSo()){
            max = nv2;
        }
        if(nv3.getHeSo()>max.getHeSo()){
            max = nv3;
        }
        System.out.println("Nhan vien co he so cao nhat la: ");
        max.xuatNV();

        System.out.println("Nhap danh sach nhan vien: ");
        DanhSach ds = new DanhSach();
        ds.nhapDS();
        ds.xuatDS();
        ds.inLuong();
    }
}
