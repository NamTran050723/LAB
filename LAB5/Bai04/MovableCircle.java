import java.util.Scanner;

public class MovableCircle implements Movable{
    private int radius;
    private MovablePoint center;
    public MovableCircle(int x, int y, int xSpeed, int ySpeed, int radius){
        super();
        this.radius=radius;
    }
    public void nhap(){
        System.out.println("Nhap thong tin tam: ");
        Scanner nhap = new Scanner(System.in);
        center= new MovablePoint(nhap.nextInt(),nhap.nextInt(),nhap.nextInt(),nhap.nextInt());
        System.out.println("Nhap thong tin ban kinh: ");
        radius = nhap.nextInt();
    }
    public int getRadius(){
        return radius;
    }
    public void setRadius(int radius){
        this.radius=radius;
    }
    public MovablePoint getCenter(){
        return center;
    }
    public void setCenter(MovablePoint center){
        this.center=center;
    }
    @Override
    public String toString(){
        return "Hinh trin tai (" + center.getX() + "," + center.getY() + "), speed = (" + center.getxSpeed() + "," + center.getySpeed() + "), ban kinh = " + radius;
    }
    @Override
    public void moveUp(){
        center.moveUp();
    }
    @Override
    public void moveDown(){ 
        center.moveDown();
    }
    @Override
    public void moveLeft(){ 
        center.moveLeft();
    }
    @Override
    public void moveRight(){ 
        center.moveRight();
    }
}
