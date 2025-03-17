import  java.util.Scanner;
class SachGiaoKhoa extends Sach{
    private int lop;
    private String nhaXuatBan;

    public SachGiaoKhoa(){
        super();
        lop = 0;
        nhaXuatBan = "";
    }
    public SachGiaoKhoa(String maSach, String tenSach, String tacGia, long gia, int lop, String nhaXuatBan){
        super(maSach, tenSach, tacGia, gia);
        this.lop = lop;
        this.nhaXuatBan = nhaXuatBan;
    }
    public int getLop(){
        return lop;
    }
    public String getNhaXuatBan(){
        return nhaXuatBan;
    }
    @Override
    public long getGiaSauGiam(){
        if(nhaXuatBan == "Giao Duc"){
            return getGia() - (getGia()*10/100);
        }
        else return getGia();
    }
    @Override
    public void xuat(){
        super.xuat();
        System.out.println("Lop: " + lop);
        System.out.println("Nha xuat ban: " + nhaXuatBan);
    }
    @Override
    public void nhap(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("++Nhap thong tin cho sach giao khoa: ");
        super.nhap();
        System.out.print("Nhap lop: ");
        lop = scanner.nextInt();
        System.out.print("Nhap nha xuat ban: ");
        nhaXuatBan = scanner.nextLine();
        scanner.nextLine();
    }
}