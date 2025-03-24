import java.util.Scanner;
class MovablePoint implements Movable {
    private int x;
    private int y;
    private int xSpeed;
    private int ySpeed;

    public MovablePoint(int x, int y, int xSpeed, int ySpeed) {
        this.x = x;
        this.y = y; 
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }
    public void nhap(){
        Scanner nhap = new Scanner(System.in);
        System.out.println("Nhap toa do x: ");
        this.x = nhap.nextInt();
        System.out.println("Nhap toa do y: ");
        this.y = nhap.nextInt();
        System.out.println("Nhap toa do xSpeed: ");
        this.xSpeed = nhap.nextInt();
        System.out.println("Nhap toa do ySpeed: ");
    }
    public int getX() {
        return x;
    }
    public int getY(){
        return y;        
    }
    public int getxSpeed(){
        return xSpeed;
    }
    public int getySpeed(){
        return ySpeed;
    }
    public void setX(int x){
        this.x=x;
    }
    public void setY(int y){
        this.y=y;
    }
    public void setxSpeed(int xSpeed){
        this.xSpeed=xSpeed;
    }
    public void setySpeed(int ySpeed){
        this.ySpeed=ySpeed;
    }
    @Override
    public String toString(){
        return x + "," + y + ", speed=(" + xSpeed + ","+ySpeed+")";
    }
    @Override
    public void moveUp(){
        y=y-ySpeed;
    }
    @Override
    public void moveDown(){
        y=y+ySpeed;
    }
    @Override
    public void moveLeft(){
        x=x-xSpeed;
    }
    @Override
    public void moveRight(){
        x=x+xSpeed;
    }
    

}