public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle(5.0, "Blue", true);
        Rectangle rectangle = new Rectangle(4.0, 6.0, "Green", false);
        Square square = new Square(3, "Yellow", true);
        System.out.println("Thong tin hinh tron: ");
        System.out.println(circle.toString());
        System.out.println("\nThong tin hinh chu nhat: ");
        System.out.println(rectangle.toString());
        System.out.println("\nThong tin hinh vuong: ");
        System.out.println(square.toString());
        System.out.println("\nKiem tra equals: ");
        System.out.println("Circle va Rectangle co bang nhau khong? "+circle.equals(rectangle));
        System.out.println("Rectangle va Square co bang nhau khong? "+rectangle.equals(square));
    }
}
