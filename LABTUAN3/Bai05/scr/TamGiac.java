class TamGiac {
    private int a, b, c;

    public TamGiac(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public void chuVi() {
        System.out.println("Chu vi tam giac: " + (a + b + c));
    }
    public void dienTich() {
        double p = (a + b + c) / 2.0;
        double s = Math.sqrt(p * (p - a) * (p - b) * (p - c));
        System.out.println("Dien tich tam giac: " + s);
    }
}
class Demo{
    public static void main(String[] args) {
        TamGiac tg = new TamGiac(3, 4, 5);
        tg.chuVi();
        tg.dienTich();
        if (a == b && b == c) {
            System.out.println("Tam giac deu");
        } else if (a == b || b == c || a == c) {
            System.out.println("Tam giac can");
        } else {
            System.out.println("Tam giac thuong");
        }
    }
}
