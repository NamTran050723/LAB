import java.util.Scanner;
public class DSHS{
    private HocSinh[] ds;
    private int soLuong;
    
    public void NhapDSHS(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap so luong hoc sinh: ");
        this.soLuong = scanner.nextInt();
        scanner.nextLine();
        ds = new HocSinh[this.soLuong];
        for(int i=0; i<this.soLuong; i++){
            System.out.println("Nhap thong tin cho hoc sinh thu " + (i+1) + ":");
            this.ds[i] = new HocSinh();
            this.ds[i].NhapHocSinh();
        }
    }
        public void XuatDSHS(){
        System.out.println("Danh sach hoc sinh: ");
        for (int i=0; i<this.soLuong;i++){
        this.ds[i].Xuat();
        }
    }
        public void SapXep(){
        for(int i=0; i<this.soLuong-1; i++){
        for(int j=i+1; j<this.soLuong; j++){
        if(this.ds[i].getDiemTB()<this.ds[j].getDiemTB()){
            HocSinh tmp = new HocSinh(this.ds[i]);
            this.ds[i] = new HocSinh(this.ds[j]);
            this.ds[j] = new HocSinh(tmp);
                }
            }  
        }
        System.out.println("Danh sach hoc sinh sau khi sap xep: ");
        for(int i=0; i<this.soLuong; i++){
        this.ds[i].Xuat();
        }
    }
}
