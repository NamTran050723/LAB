import java.util.Scanner;
class SachVanHoc extends Sach{
    private int lanXuatBan;

    public SachVanHoc(){
        super();
        lanXuatBan = 0;
    }
    public SachVanHoc(String maSach, String tenSach, String tacGia, long gia, int lanXuatBan){
        super(maSach, tenSach, tacGia, gia);
        this.lanXuatBan = lanXuatBan;
    }
    public int getLanXuatBan(){
        return lanXuatBan;
    }
    @Override
    public long getGiaSauGiam(){
        if(getGia() > 300000){
            return getGia() - (getGia()*20/100);
        }
        else return getGia();
    }
    @Override
    public void xuat(){
        super.xuat();
        System.out.println("Lan xuat ban: " + lanXuatBan);
    }
    @Override
    public void nhap(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("++Nhap thong tin cho sach van hoc: ");
        super.nhap();
        System.out.print("Nhap lan xuat ban: ");
        lanXuatBan = scanner.nextInt();
    }
}