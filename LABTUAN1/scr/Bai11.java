import java.util.Scanner;

public class Bai11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int soDao = 0;
        int am = 0;
        if (n < 0) {
            am = 1;
            n = -n;
        }

        while (n > 0) {
            soDao = soDao * 10 + n % 10;
            n /= 10;
        }

        if (am == 1) soDao = -soDao;
        System.out.println(soDao);
    }
}
