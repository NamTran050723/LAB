import java.util.Scanner;
class QuanLy extends NhanVien{
        private String chuyenMon;
        private double phuCapChucVu;
        public QuanLy(){
            this.chuyenMon="";
            this.phuCapChucVu=0.0;
        }
        public QuanLy(String maNhanVien, String tenNhanVien, String trinhDo, String chuyenMon, double phuCapChucVu) {
            super(maNhanVien, tenNhanVien, trinhDo);
            this.chuyenMon=chuyenMon;
            this.phuCapChucVu=phuCapChucVu;
        }
        public String getChuyenMon(){
            return chuyenMon;
        }
        public double getPhuCapChucVu(){
            return phuCapChucVu;
        }
        @Override
        public void nhap(){
            super.nhap();
            Scanner scanner = new Scanner(System.in);
            System.out.print("Nhap chuyen mon: ");
            this.chuyenMon = scanner.nextLine();
            System.out.print("Nhap phu cap chuc vu: ");
            this.phuCapChucVu = scanner.nextDouble();
        }
        @Override
        public void xuat(){
            super.xuat();
            System.out.println("Chuyen mon: " + this.chuyenMon + ", Phu cap chuc vu: " + this.phuCapChucVu);
        }
        @Override
        public double tinhLuong(){
            return getLuongCoBan() + this.phuCapChucVu;
        }
}
