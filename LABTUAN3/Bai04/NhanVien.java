public class NhanVien{
    private int maSo;
    private String hoTen;
    private double luongCB;
    private double heSo;
    private int soLuong;

    public NhanVien(){
        maSo = 0;
        hoTen = "";
        luongCB = 0;
        heSo = 0;
        soLuong = 0;
    }
    public NhanVien(int maSo, String hoTen, double luongCB, double heSo, int soLuong){
        this.maSo = maSo;
        this.hoTen = hoTen;
        this.luongCB = luongCB;
        this.heSo = heSo;
        this.soLuong = soLuong;
    }
    public NhanVien(NhanVien nv){
        this.maSo = nv.maSo;
        this.hoTen = nv.hoTen;
        this.luongCB = nv.luongCB;
        this.heSo = nv.heSo;
        this.soLuong = nv.soLuong;
    }
    public int getMaSo(){
        return maSo;
    }
    public String getHoTen(){
        return hoTen;
    }
    public double getHeSo(){
        return heSo;
    }
    public int setMaSo(int maSo){
        this.maSo = maSo;
        return maSo;
    }
    public String setHoTen(String hoTen){
        this.hoTen = hoTen;
        return hoTen;
    }
    public double setHeSo(double heSo){
        this.heSo = heSo;
        return heSo;
    }
    public void nhapNV(){
        Scanner nhap = new Scanner(System.in);
        System.out.println("Nhap ma so: ");
        maSo = nhap.nextInt();
        nhap.nextLine();
        System.out.println("Nhap ho ten: ");
        hoTen = nhap.nextLine();
        System.out.println("Nhap luong co ban: ");
        luongCB = nhap.nextDouble();
        System.out.println("Nhap he so: ");
        heSo = nhap.nextDouble();
        System.out.println("Nhap so luong: ");
        soLuong = nhap.nextInt();
    }
    public void xuatNV(){
        System.out.println("Ma so: " + this.maSo);
        System.out.println("Ho ten: " + this.hoTen);
        System.out.println("Luong co ban: " + this.luongCB);
        System.out.println("He so: " + this.heSo);
        System.out.println("So luong: " + this.soLuong);
    }
    }
    public void inLuong(){
        double luong = this.luongCB * this.heSo*this.soLuong;
        System.out.println("Luong cuoi cung: " +luong);
    }
    
}