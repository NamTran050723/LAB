import java.util.Scanner;
public class Bai06
{
    public static void main(String[] args)
     {
        double a;
        double b;
        double c;
        Scanner nhap = new Scanner(System.in);
        System.out.println("Nhap vao ba canh a,b,c cua tam giac de kiem tra:");
        a = nhap.nextDouble();
        b = nhap.nextDouble();
        c = nhap.nextDouble();
        double dk1=a+b;
        double dk2=a+c;
        double dk3=b+c;
        if (dk1>c && dk2>b && dk3>a) 
        {
            System.out.println("Tam giac hop le");
        }
        else {
            System.out.println("Tam giac khong hop le");
             }
     }
 }