

public class Point2D{
    private float x;
    private float y;
    
    public Point2D(){
        this.x = 0.0f;
        this.y = 0.0f;
    }
    public Point2D(float x, float y){
        this.x = x;
        this.y = y;
    }
    public float getX(){
        return this.x;
    }
    public float getY(){
        return this.y;
    }
    public Point2D tongDiem(Point2D p){
        float x2 = this.x + p.x;
        float y2 = this.y + p.y;
        return new Point2D(x2, y2);
    }
    public Point2D doiXung(){
        return new Point2D(-this.x, -this.y);
    }
    public void inToaDo(){
        System.out.println("("+this.x+","+this.y+")");
    }
}