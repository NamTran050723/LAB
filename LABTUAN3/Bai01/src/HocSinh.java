import java.util.Scanner;
    public class HocSinh{
    private int maSo;
    private String hoTen;
    private double diemTB;

    public HocSinh(){
        this.maSo = 0;
        this.hoTen = null;
        this.diemTB = 0.0;
    }
    public HocSinh(int maSo, String hoTen, double diemTB){
        this.maSo = maSo;
        this.hoTen = hoTen;
        this.diemTB = diemTB;
    }
    public HocSinh(HocSinh tmp){
        this.maSo=tmp.maSo;
        this.hoTen=tmp.hoTen;
        this.diemTB=tmp.diemTB;
    }
    public int getMaSo(){
        return this.maSo;
    }
    public String getHoTen(){
        return this.hoTen;
    }
    public double getDiemTB(){
        return this.diemTB;
    }
    public void setMaSo(int maSo){
        this.maSo = maSo;
    }
    public void setHoTen(String hoTen){
        this.hoTen = hoTen;
    }
    public void setDiemTB(double diemTB){
        this.diemTB = diemTB;
    }

    public void NhapHocSinh(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap ma so: ");
        this.maSo = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Nhap ho ten: ");
        this.hoTen = scanner.nextLine();
        System.out.print("Nhap diem trung binh: ");
        this.diemTB = scanner.nextDouble();
    }
    public void Xuat(){
        System.out.println("Ma so: " + this.maSo);
        System.out.println("Ho ten: " + this.hoTen);
        System.out.println("Diem trung binh: " + this.diemTB);
    }
}


