import java.util.Scanner;
public class Bai07
{
    public static void main(String[] args)
     {
        double ly;
        double hoa;
        double sinh;
        double toan;
        double maytinh;
        Scanner nhap = new Scanner(System.in);
        System.out.println("Nhap vao lan luot 5 diem Ly, Hoa, Sinh, Toan, May tinh :");
        ly= nhap.nextDouble();
        hoa= nhap.nextDouble();
        sinh= nhap.nextDouble();
        toan= nhap.nextDouble();
        maytinh= nhap.nextDouble();
        Double tongdiem=ly+hoa+sinh+toan+maytinh;
        System.out.println("Tong diem la: "+tongdiem);
        Double phantram=(tongdiem/500)*100;
        System.out.println("Quy ra phan tram la: "+phantram);
        if (phantram>90) {
            System.out.println("Ban dat hang A");
        }
        else if (phantram>80) {
            System.out.println("Ban dat hang B");
        }
        else if (phantram>70) {
            System.out.println("Ban dat hang C");
        }
        else if (phantram>60) {
            System.out.println("Ban dat hang D");
        }
        else if (phantram>40) {
            System.out.println("Ban dat hang E");
        }
        else {
            System.out.println("Ban dat hang F");
        }
     }
}