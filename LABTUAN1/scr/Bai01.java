import java.util.Scanner;
public class Bai01 
{
    public static void main(String[] args) 
    {
        String ten;
        int ngaysinh;
        int mssv;
        Scanner nhap = new Scanner(System.in);
        System.out.printf("Nhap ho va ten : "); ten = nhap.nextLine();
        System.err.printf("Nhap ngay sinh :");ngaysinh = nhap.nextInt();
        System.out.printf("Nhap MSSV : ");mssv = nhap.nextInt();
        System.out.println("Ho va ten : "+ten);
        System.out.println("Ngay sinh : "+ngaysinh);
        System.out.println("Ma so sinh vien : "+mssv);
    }
}