public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle(2.0,"blue");
        System.out.println("---Circle: " + "\n"+ "Radius: "+ circle.getRadius() + "\n" + "Color: " + circle.getColor());
        System.out.println("Area: " + circle.getArea());
        Cylinder cylinder = new Cylinder(2.0, 3.0, "green");
        System.out.println("---Cylinder: " + "\n" + "Radius: " + cylinder.getRadius() + "\n" + "Height: " + cylinder.getHeight() + "\n" + "Color: " + cylinder.getColor());
        System.out.print("Volume: " + cylinder.getVolume());
    }
}
