import java.util.Scanner;

public class Bai09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap so kWh tieu thu: ");
        int n = scanner.nextInt();
        if (n < 0) {
            System.out.println("So kWh khong hop le");
        }

        int tongTien = 0;
        int soLuong;

        if (n > 0) {
            if (n > 50) {
                soLuong = 50;
            } else {
                soLuong = n;
            }
            tongTien += soLuong * 2000;
            n -= soLuong;
        }

        if (n > 0) {
            if (n > 50) {
                soLuong = 50;
            } else {
                soLuong = n;
            }
            tongTien += soLuong * 2500;
            n -= soLuong;
        }

        if (n > 0) {
            if (n > 100) {
                soLuong = 100;
            } else {
                soLuong = n;
            }
            tongTien += soLuong * 3000;
            n -= soLuong;
        }

        if (n > 0) {
            if (n > 100) {
                soLuong = 100;
            } else {
                soLuong = n;
            }
            tongTien += soLuong * 4000;
            n -= soLuong;
        }

        if (n > 0) {
            tongTien += n * 5000;
        }

        System.out.println("So tien can tra: " + tongTien + " dong");
    }
}
