import java.util.Scanner;
public class HinhChuNhat implements Hinh{
    private float dai, rong;
    public HinhChuNhat() {
        dai = rong = 0.0f;
    }
    public HinhChuNhat(float dai, float rong) {
        this.dai = dai;
        this.rong = rong;
    }
    public void nhap() {
        Scanner nhap = new Scanner(System.in);
        System.out.print("Nhap chieu dai: ");
        dai = nhap.nextFloat();
        System.out.print("Nhap chieu rong: ");
        rong = nhap.nextFloat();
    }
    public void xuat() {
        System.out.println("Chieu dai: " + dai);
        System.out.println("Chieu rong: " + rong);
        System.out.println("Dien tich: " + dienTich());
    }
    public float dienTich() {
        return dai * rong;
    }
    
}
