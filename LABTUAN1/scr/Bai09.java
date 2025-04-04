import java.util.Scanner;

public class Bai09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int tong = 0, tich = 1;
        if (n == 0) tich = 0;
        if (n < 0) n = -n;

        while (n > 0) {
            int chuSo = n % 10;
            tong += chuSo;
            tich *= chuSo;
            n /= 10;
        }

        System.out.println(tong);
        System.out.println(tich);
    }
}
