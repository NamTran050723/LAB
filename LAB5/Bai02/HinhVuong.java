import java.util.Scanner;
class HinhVuong implements Hinh{
    private float canh;
    public HinhVuong(){
        canh = 0.0f;
}
    public HinhVuong(float canh){
        this.canh = canh;
    }
    @Override
    public void nhap(){
        Scanner nhap = new Scanner(System.in);
        System.out.print("Nhap canh: ");
        canh = nhap.nextFloat();
    }
    @Override
    public void xuat(){
        System.out.println("Canh: "+canh);
        System.out.println("Dien tich: " + dienTich());
    }
    @Override
    public float dienTich(){
        return canh*canh;
    }
}