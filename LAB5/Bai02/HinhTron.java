import java.util.Scanner;
public class HinhTron implements Hinh{
    private float banKinh;
    public HinhTron() {
        banKinh = 0.0f;
    }
    public HinhTron(float banKinh) {
        this.banKinh = banKinh;
    }
    public void nhap() {    
        Scanner nhap = new Scanner(System.in);
        System.out.print("Nhap ban kinh: ");    
        banKinh = nhap.nextFloat();
    }
    public void xuat() {
        System.out.println("Ban kinh: " + banKinh);
        System.out.println("Dien tich: " + dienTich());
    }
    public float dienTich() {    
        return banKinh * banKinh * pi;
    }
}
