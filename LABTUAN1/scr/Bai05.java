import java.util.Scanner;
public class Bai05 
{
    public static void main(String[] args) {
        double a;
        double b;
        double c;
        Scanner nhap= new Scanner(System.in);
        System.out.printf("Nhap so a: "); a= nhap.nextDouble();
        System.out.printf("Nhap so b: "); b= nhap.nextDouble();
        System.out.printf("Nhap so c: "); c= nhap.nextDouble();
        double min = a;
        if (b<min) {min = b;}
        if (c<min) {min = c;}
        System.out.println("So nho nhat la: "+min); 
    }
}