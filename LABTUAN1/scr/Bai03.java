import java.util.Scanner;
public class Bai03
{
    public static void main(String[] args) 
    {
        double F;
        double C;
        Scanner nhap= new Scanner(System.in);
        System.out.printf("Nhap vao so do F: "); F = nhap.nextDouble();
        C = (F-32)/1.8;
        System.out.println("So do C la: "+C);
    }
}