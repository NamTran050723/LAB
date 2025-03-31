import java.util.Scanner;

class Student {
    private String stID;
    private String stName;
    private String stClass;

    public Student() {
        this.stID = "0";
        this.stName = "0";
        this.stClass = "0";
    }

    public Student(String stID, String stName, String stClass) {
        this.stID = stID;
        this.stName = stName;
        this.stClass = stClass;
    }

    public Student(Student st) {
        this.stID = st.stID;
        this.stName = st.stName;
        this.stClass = st.stClass;
    }

    public String getStID() {
        return stID;
    }
    
    public String getStName() {
        return stName;
    }
    
    public String getStClass() {
        return stClass;
    }

    public void setStID(String id) {
        this.stID = id;
    }
    
    public void setStName(String name) {
        this.stName = name;
    }
    
    public void setStClass(String className) {
        this.stClass = className;
    }

    public String toString() {
        return "ID: " + stID + ", Name: " + stName + ", Class: " + stClass;
    }
}

class Book {
    private String boCode;
    private String boTitle;
    private String boAuthor;

    public Book() {
        this.boCode = "0";
        this.boTitle = "0";
        this.boAuthor = "0";
    }

    public Book(String boCode, String boTitle, String boAuthor) {
        this.boCode = boCode;
        this.boTitle = boTitle;
        this.boAuthor = boAuthor;
    }

    public Book(Book bo) {
        this.boCode = bo.boCode;
        this.boTitle = bo.boTitle;
        this.boAuthor = bo.boAuthor;
    }

    public String getBoCode() {
        return boCode;
    }
    
    public String getBoTitle() {
        return boTitle;
    }
    
    public String getBoAuthor() {
        return boAuthor;
    }
}

class SanPham {
    private String tenSP;
    private double donGia;
    private double giamGia;

    public SanPham() {
        this.tenSP = "0";
        this.donGia = 0;
        this.giamGia = 0;
    }

    public void nhap() {
        Scanner scanner = new Scanner(System.in);
        tenSP = scanner.nextLine();
        donGia = scanner.nextDouble();
        giamGia = scanner.nextDouble();
    }

    public double getThueNhapKhau() {
        return donGia * 0.1;
    }

    public void xuat() {
        System.out.println("SanPham: " + tenSP);
        System.out.println("Gia: " + donGia);
        System.out.println("Giam gia: " + giamGia);
        System.out.println("Thue nhap khau: " + getThueNhapKhau());
    }
}

public class Main {
    public static void main(String[] args) {
        SanPham sp = new SanPham();
        sp.nhap();
        sp.xuat();
    }
}
