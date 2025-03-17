import java.util.Scanner;
class HangDienMay extends HangHoa{
    private int thoiGianBaoHanh;
    private int dienAp;
    private int congSuat;

    public HangDienMay(){
        super();
        this.thoiGianBaoHanh = 0;
        this.dienAp = 0;
        this.congSuat = 0;
    }
    public HangDienMay(String maHang, String tenHang, long donGia, int thoiGianBaoHanh, int dienAp, int congSuat){
        super(maHang, tenHang, donGia);
        this.thoiGianBaoHanh = thoiGianBaoHanh;
        this.dienAp = dienAp;
        this.congSuat = congSuat;
    }
    public int getThoiGianBaoHanh(){
        return this.thoiGianBaoHanh;
    }
    public int getDienAp(){
        return this.dienAp;
    }
    public int getCongSuat(){
        return this.congSuat;
    }
    public void nhap(){
        Scanner nhap = new Scanner(System.in);
        System.out.print("Nhap thoi gian bao hanh (thang): ");
        this.thoiGianBaoHanh = nhap.nextInt();
        System.out.print("Nhap dien ap: ");
        this.dienAp = nhap.nextInt();
        System.out.print("Nhap cong suat: ");
        this.congSuat = nhap.nextInt();
    }
    public void xuat(){
        System.out.println("---Ma Hang: " + this.getMaHang());
        System.out.println("Ten Hang: " + this.getTenHang());
        System.out.println("Don Gia: " + this.getDonGia());
        System.out.println("Thoi gian bao hanh: " + this.thoiGianBaoHanh);
        System.out.println("Dien ap: " + this.dienAp);
        System.out.println("Cong suat: " + this.congSuat);
    }
}