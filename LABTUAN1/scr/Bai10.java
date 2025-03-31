import java.util.Scanner;

public class Bai10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int dem = 0;
        if (n == 0) dem = 1;
        if (n < 0) n = -n;

        while (n > 0) {
            dem++;
            n /= 10;
        }

        System.out.println(dem);
    }
}
