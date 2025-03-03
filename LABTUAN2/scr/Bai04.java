import java.util.Scanner;

public class Bai04 {
    private String tenChuXe;
    private String loaiXe;
    private int dungTich;
    private double triGia;
    private double thue;

    public Bai04(String tenChuXe, String loaiXe, int dungTich, double triGia) {
        this.tenChuXe = tenChuXe;
        this.loaiXe = loaiXe;
        this.dungTich = dungTich;
        this.triGia = triGia;
    }

    public double tinhThue() {
        if (dungTich < 100) {
            thue = triGia * 0.01;
        } else if (dungTich >= 100 && dungTich <= 200) {
            thue = triGia * 0.03;
        } else {
            thue = triGia * 0.05;
        }
        return thue;
    }

    public String getTenChuXe() {
        return tenChuXe;
    }

    public String getLoaiXe() {
        return loaiXe;
    }

    public int getDungTich() {
        return dungTich;
    }

    public double getTriGia() {
        return triGia;
    }

    public double getThue() {
        return thue;
    }

    public static void main(String[] args) {
        Scanner nhap = new Scanner(System.in);
        Bai04 xe1 = new Bai04("Tran Hoai Nam", "Exciter", 150, 50000000);
        Bai04 xe2 = new Bai04("Tran Ngoc Anh Thu", "Wave", 90, 30000000);
        Bai04 xe3 = new Bai04("Nguyen Van Nam", "SH", 350, 100000000);
        double thue1 = xe1.tinhThue();
        double thue2 = xe2.tinhThue();
        double thue3 = xe3.tinhThue();
        System.out.println("Ten chu xe          Loai xe         Dung tich    Tri gia           Thue phai nop");
        System.out.println("==========================================================================");
        System.out.printf("%-20s %-15s %-10d %-15.2f %-10.2f\n", xe1.getTenChuXe(), xe1.getLoaiXe(), xe1.getDungTich(), xe1.getTriGia(),thue1);
        System.out.printf("%-20s %-15s %-10d %-15.2f %-10.2f\n", xe2.getTenChuXe(), xe2.getLoaiXe(), xe2.getDungTich(), xe2.getTriGia(),thue2);
        System.out.printf("%-20s %-15s %-10d %-15.2f %-10.2f\n", xe3.getTenChuXe(), xe3.getLoaiXe(), xe3.getDungTich(), xe3.getTriGia(),thue3);
    }
}
