package KeThua;
public abstract class HinhHoc{
    public float Pi=3.14f;
    public String ten;
    public float chuVi;
    public float dienTich;
    public float theTich;

    public HinhHoc(){
    }
    public void xuatTen(){
        System.out.println("Ten hinh: "+ten);
    }
    public void inChuVi(){
        System.out.println("Chu vi: "+chuVi);
    }
    public void inDienTich(){
        System.out.println("Dien tich: "+dienTich);
    }
    public void inTheTich(){
        System.out.println("The tich: "+theTich);
    }
}


    