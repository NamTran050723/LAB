import java.util.Scanner;
class Bai01 {
    private int a, b, c, d, e;

    public Bai01(int a, int b, int c, int d, int e) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
    }
    public void Xuat(){
        System.out.println("Mang so nguyen gom 5 so: " + this.a + " " + this.b + " " + this.c + " " + this.d + " " + this.e);
    }

    public void Timvitri() {
        Scanner nhap = new Scanner(System.in);
        System.out.println("Nhap vao so can tim trong mang so nguyen: ");
        int socantim = nhap.nextInt();
        if (socantim == this.a) {
            System.out.println("Vi tri so can tim la: 1");
        } else if (socantim == this.b) {
            System.out.println("Vi tri so can tim la: 2");
        } else if (socantim == this.c) {
            System.out.println("Vi tri so can tim la: 3");
        } else if (socantim == this.d) {
            System.out.println("Vi tri so can tim la: 4");
        } else if (socantim == this.e) {
            System.out.println("Vi tri so can tim la: 5");
        } else {
            System.out.println("So can tim khong co trong mang so nguyen");
        }
    }
    public void TimSoLon(){
        int max = this.a;
        if (max < this.b) {
            max = this.b;
        }
        if (max < this.c) {
            max = this.c;
        }
        if (max < this.d) {
            max = this.d;
        }
        if (max < this.e) {
            max = this.e;
        }
        System.out.println("So lon nhat trong mang so nguyen la: " + max);
    }
    public void TimSoNho(){
        int min = this.a;
        if (min > this.b) {
            min = this.b;
        }
        if (min > this.c) {
            min = this.c;
        }
        if (min > this.d) {
            min = this.d;
        }
        if (min > this.e) {
            min = this.e;
        }
        System.out.println("So nho nhat trong mang so nguyen la: " + min);
    }
    public void ViTriSoLonNhat() {
        int max = this.a;
        if (max < this.b) {
            max = this.b;
        }
        if (max < this.c) {
            max = this.c;
        }
        if (max < this.d) {
            max = this.d;
        }
        if (max < this.e) {
            max = this.e;
        }
        
        if (max == this.a) {
            System.out.println("Vi tri so lon nhat la: 1");
        } else if (max == this.b) {
            System.out.println("Vi tri so lon nhat la: 2");
        } else if (max == this.c) {
            System.out.println("Vi tri so lon nhat la: 3");
        } else if (max == this.d) {
            System.out.println("Vi tri so lon nhat la: 4");
        } else if (max == this.e) {
            System.out.println("Vi tri so lon nhat la: 5");
        }
            }
    public void TangDan() {
        int[] mangsapxep = {this.a, this.b, this.c, this.d, this.e};
        java.util.Arrays.sort(mangsapxep);
        this.a = mangsapxep[0];
        this.b = mangsapxep[1];
        this.c = mangsapxep[2];
        this.d = mangsapxep[3];
        this.e = mangsapxep[4];
        System.out.println("Mang so nguyen sau khi sap xep tang dan: " + this.a + " " + this.b + " " + this.c + " " + this.d + " " + this.e);
    }
    
        public static void main(String[] args) {
        Scanner nhap = new Scanner(System.in);
        System.out.println("Nhap vao mang so nguyen gom 5 so: ");
        int a = nhap.nextInt();
        int b = nhap.nextInt();
        int c = nhap.nextInt();
        int d = nhap.nextInt();
        int e = nhap.nextInt();
        Bai01 bai01 = new Bai01(a, b, c, d, e);
        bai01.Xuat();
        bai01.Timvitri();
        bai01.TimSoLon();
        bai01.TimSoNho();
        bai01.ViTriSoLonNhat();
        bai01.TangDan();
    }
}
