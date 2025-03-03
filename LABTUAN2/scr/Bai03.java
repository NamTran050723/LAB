import java.util.Scanner;
class Bai03 {
    private int MSSV;
    private String hoTen;
    private float diemLT, diemTH;

    public Bai03() {
        this.MSSV = 0;
        this.hoTen = "";
        this.diemLT = 0;
        this.diemTH = 0;
    }
    public Bai03(int MSSV, String hoTen, float diemLT, float diemTH) {
        this.MSSV = MSSV;
        this.hoTen = hoTen;
        this.diemLT = diemLT;
        this.diemTH = diemTH;
    }
    public int getMSSV() {
        return MSSV;
    }
    public void setMSSV(int MSSV) {
        this.MSSV = MSSV;
    }
    public String getHoTen() {
        return hoTen;
    }
    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }
    public float getDiemLT() {
        return diemLT;
    }
    public void setDiemLT(float diemLT) {
        this.diemLT = diemLT;
    }
    public float getDiemTH() {
        return diemTH;
    }
    public void setDiemTH(float diemTH) {
        this.diemTH = diemTH;
    }
    public float tinhDiemTB() {
        float diemTB = (diemLT + diemTH) / 2;
        return diemTB;
    }
    @Override
    public String toString() {
        return "SinhVien{" +"\n"+
                "MSSV=" + MSSV +"\n"+
                ", hoTen='" + hoTen + '\'' +"\n"+
                ", diemLT=" + diemLT +"\n"+
                ", diemTH=" + diemTH +"\n"+
                ", diemTB=" + (diemLT + diemTH) / 2 +"\n"+
                "}";
    }
    public static void main(String[] args) {
        Bai03 sv1 = new Bai03(1250080117,"Tran Hoai Nam",5,7);
        Bai03 sv2 = new Bai03(1250080222,"Tran Ngoc Anh",6,8);
        Bai03 sv3 = new Bai03();
        Scanner nhap = new Scanner(System.in);
        System.out.println("Nhap MSSV: ");
        sv3.setMSSV(nhap.nextInt());
        nhap.nextLine();
        System.out.println("Nhap ho ten: "); 
        sv3.setHoTen(nhap.nextLine());
        System.out.println("Nhap diem LT: ");
        sv3.setDiemLT(nhap.nextFloat());
        System.out.println("Nhap diem TH: ");
        sv3.setDiemTH(nhap.nextFloat());
        System.out.printf("%-10s %-20s %-10s %-10s %-10s%n", "MSSV", "Ho Ten", "Diem LT", "Diem TH", "Diem TB");
        System.out.printf("%-10d %-20s %-10.2f %-10.2f %-10.2f%n", sv1.getMSSV(), sv1.getHoTen(), sv1.getDiemLT(), sv1.getDiemTH(), sv1.tinhDiemTB());
        System.out.printf("%-10d %-20s %-10.2f %-10.2f %-10.2f%n", sv2.getMSSV(), sv2.getHoTen(), sv2.getDiemLT(), sv2.getDiemTH(), sv2.tinhDiemTB());
        System.out.printf("%-10d %-20s %-10.2f %-10.2f %-10.2f%n", sv3.getMSSV(), sv3.getHoTen(), sv3.getDiemLT(), sv3.getDiemTH(), sv3.tinhDiemTB());
    }
}
