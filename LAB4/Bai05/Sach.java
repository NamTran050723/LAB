import java.util.Scanner;
class Sach{
    private String maSach;
    private String tenSach;
    private String tacGia;
    private long gia;

    public Sach(){
        maSach = "";
        tenSach = "";
        tacGia = "";
        gia = 0;
    }
    public Sach(String maSach, String tenSach, String tacGia, long gia){
        this.maSach = maSach;
        this.tenSach = tenSach;
        this.tacGia = tacGia;
        this.gia = gia;
    }
    public String getMaSach(){
        return maSach;
    }
    public String getTenSach(){
        return tenSach;
    }
    public String getTacGia(){
        return tacGia;
    }
    public long getGia(){
        return gia;
    }
    public long getGiaSauGiam(){
        return gia;
    }
    public void xuat(){
        System.out.println("---Ma sach: " + maSach);
        System.out.println("Ten sach: " + tenSach);
        System.out.println("Tac gia: " + tacGia);
        System.out.println("Gia: " + gia);
    }
    public void nhap(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap ma sach: ");
        maSach = scanner.nextLine();
        System.out.print("Nhap ten sach: ");
        tenSach = scanner.nextLine();
        System.out.print("Nhap tac gia: ");
        tacGia = scanner.nextLine();
        System.out.print("Nhap gia: ");
        gia = scanner.nextLong();
    }
}