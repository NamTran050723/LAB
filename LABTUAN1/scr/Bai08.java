import java.util.Scanner;
public class Bai08
{
    public static void main(String[] args)
     {
        int so;
        int sodautien;
        int socuoicung;
        Scanner nhap=new Scanner(System.in);
        System.out.println("Nhap vao so muon tim: "); so = nhap.nextInt();
        sodautien = so;
        socuoicung = so;
        if (socuoicung<0) {
            socuoicung = -sodautien;
        }
        socuoicung= socuoicung%10;
        if (sodautien<0) {
            sodautien=-sodautien;
        }
        while (sodautien>=10) {
            sodautien /= 10;
        }
        System.out.println("So ban dau: "+so);
        System.out.println("So dau tien: "+sodautien);
        System.out.println("So cuoi cung: "+socuoicung);
     }
 }