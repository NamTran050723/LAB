import java.util.Scanner;
public class PhanSo{
    private int tuSo;
    private int mauSo;

    public PhanSo(){
        this.tuSo = 0;
        this.mauSo = 1;
    }
    public PhanSo(int tuSo, int mauSo){
        this.tuSo = tuSo;
        if (mauSo!=0)
            this.mauSo = mauSo;
        else{
            System.out.println("Mau so phai khac 0");
            this.mauSo = 1;
        }
    }
    public PhanSo(PhanSo p){
        this.tuSo = p.tuSo;
        this.mauSo = p.mauSo;
    }
    public void nhapPhanSo(){
        Scanner nhap=new Scanner(System.in);
        System.out.print("Nhap tu so: ");
        tuSo = nhap.nextInt();
        System.out.print("Nhap mau so: ");
        mauSo = nhap.nextInt();
    }
    public void xuatPhanSo(){
        System.out.println("Phan so la: "+tuSo + "/" + mauSo);
    } 
    private int USCLN(){
        int a = Math.abs(tuSo);
        int b = Math.abs(mauSo);
        while (b!=0){
            int c = b;
            b = a%b;
            a = c;
        }
        return a;
    }
    private void rutGon(){
        int uscln = USCLN();
        tuSo = tuSo/uscln;
        mauSo = mauSo/uscln;
    }
    public PhanSo cong(PhanSo p){
        int newTuSo = tuSo*p.mauSo + mauSo*p.tuSo;
        int newMauSo = mauSo*p.mauSo;
        PhanSo ps = new PhanSo(newTuSo, newMauSo);
        ps.rutGon();
        return ps;
    }
    public PhanSo tru(PhanSo p){
        int newTuSo = tuSo*p.mauSo - mauSo*p.tuSo;
        int newMauSo = mauSo*p.mauSo;
        PhanSo ps = new PhanSo(newTuSo, newMauSo);
        ps.rutGon();
        return ps;
    }
    public PhanSo nhan(PhanSo p){
        int newTuSo = tuSo*p.tuSo;
        int newMauSo = mauSo*p.mauSo;
        PhanSo ps = new PhanSo(newTuSo, newMauSo);
        ps.rutGon();
        return ps;
    } 
    public PhanSo chia(PhanSo p){
        if (p.tuSo==0){
            System.out.println("Khong the chia cho 0");
            return new PhanSo();
        }
        int newTuSo = tuSo*p.mauSo;
        int newMauSo = mauSo*p.tuSo;
        PhanSo ps = new PhanSo(newTuSo, newMauSo);
        ps.rutGon();
        return ps;
    }
}
    