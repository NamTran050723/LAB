class Rectangle extends Shape{
    private double width = 1.0;
    private double length = 1.0;
    public Rectangle(){
        super();
        this.width = 1.0;
        this.length = 1.0;
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
    public double getArea(){
        return this.width * this.length;
    }
    public double getPerimeter(){
        return 2 * (this.width + this.length);
    }
    @Override
    public String toString(){
        super.toString();
        return "---Shape: Rectangle" + "\n" +
                "width: " + getWidth() + "\n" +
                "length: " + getLength() + "\n" +
                "area: " + getArea() + "\n" +
                "perimeter: " + getPerimeter();
    }
}