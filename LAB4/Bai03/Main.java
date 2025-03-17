public class Main {
    public static void main(String[] args) {
        Shape shape = new Shape("Blue", false);
        System.out.println(shape.toString());
        Circle circle = new Circle(2.0, "Green", true);
        System.out.println(circle.toString());
        System.out.println("Circle Area: " + circle.getArea());
        System.out.println("Circle Perimeter: " + circle.getPerimeter());
        Rectangle rectangle = new Rectangle(3.0, 4.0, "Yellow", false);
        System.out.println(rectangle.toString());
        System.out.println("Rectangle Area: " + rectangle.getArea());
        System.out.println("Rectangle Perimeter: " + rectangle.getPerimeter());
        Square square = new Square(2.5, "purple", true);
        System.out.println(square.toString());
        System.out.println("Square Area: " + square.getArea());
        System.out.println("Square Perimeter: " + square.getPerimeter());
    }
}
