import java.util.Scanner;
public class DanhSach{
    private NhanVien[] ds;
    private int soLuongNV;

    public void nhapDS(){
        Scanner nhap = new Scanner(System.in);
        System.out.println("Nhap so luong nhan vien: ");
        soLuongNV = nhap.nextInt();
        ds = new NhanVien[soLuongNV];
        for(int i = 0; i < soLuongNV; i++){
            ds[i] = new NhanVien();
            ds[i].nhapNV();
        }
    }
    public void xuatDS(){
        for(int i = 0; i < soLuongNV; i++){
            ds[i].xuatNV();
        }
    }

    public void inLuong() {
        for (int i = 0; i < soLuongNV; i++) {
            ds[i].inLuong();
        }
    }
}