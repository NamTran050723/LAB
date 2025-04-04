class Rectangle extends Shape{
    private double width;
    private double length;
    public Rectangle(){
        super();
        this.width =0.0;
        this.length =0.0;
    }
    public Rectangle(double width, double length){
        super();
        this.width = width;
        this.length = length;
    }
    public Rectangle(double width, double length, String color, boolean filled){
        super(color, filled);
        this.width = width;
        this.length = length;
    }
    public double getWidth(){
        return this.width;
    }
    public void setWidth(double width){
        this.width = width;
    }
    public double getLength(){
        return this.length;
    }
    public void setLength(double length){
        this.length = length;
    }
    @Override
    public double getArea(){
        return this.width * this.length;
    }
    @Override
    public double getPerimeter(){
        return 2 * (this.width + this.length);
    }
    @Override
    public String toString(){
        return "Hinh chu nhat [width=" + getWidth() + ", length=" + getLength() + ", color=" + getColor() + ", filled=" + isFilled() + "]";
    }
}