import java.util.Scanner;
public class Bai04
{
    public static void main(String[] args)
    {
        int nam;
        Scanner nhap= new Scanner(System.in);
        System.out.printf("Nhap vao so nam can tinh: "); nam=nhap.nextInt();
        if (nam %4 ==0 && nam%100 !=0) {
            System.err.println("Nam "+nam+" la nam nhuan");
        }
        else {
            System.out.println("Nam "+nam+" khong phai la nam nhuan");
        }
    }
}
