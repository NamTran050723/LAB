class Circle extends Shape{
    private double radius = 1.0;

    public Circle(){
        super();
        this.radius = 1.0;
    }
    public Circle(double radius, String color, boolean filled){
        super(color, filled);
        this.radius = radius;
    }
    public double getRadius(){
        return this.radius;
    }
    public void setRadius(double radius){
        this.radius = radius;
    }
    public double getArea(){
        return Math.PI * this.radius * this.radius;
    }
    public double getPerimeter(){
        return 2 * Math.PI * this.radius;
    }
    @Override
    public String toString(){
        super.toString();
        return "---Shape: Circle" + "\n" +
                "radius: " + getRadius() + "\n" +
                "area: " + getArea() + "\n" +
                "perimeter: " + getPerimeter();
    }
}