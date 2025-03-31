import java.util.Scanner;

public class Bai12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int soGoc = n, soDao = 0;
        int doiXung = 0;

        if (n >= 0) {
            while (n > 0) {
                soDao = soDao * 10 + n % 10;
                n /= 10;
            }
            if (soDao == soGoc) doiXung = 1;
        }

        System.out.println(doiXung);
    }
}
