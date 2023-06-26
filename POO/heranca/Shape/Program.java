package POO.heranca.Shape;

public class Program {
    /*
     Write a Java program to create a class called Shape with methods called getPerimeter() and getArea().
     Create a subclass called Circle that overrides the getPerimeter() and getArea() methods to calculate the
     area and perimeter of a circle.
    */
    public static void main(String[] args) {
        Shape shape = new Shape();
        Circle circle = new Circle(3d);
        System.out.println("Shape perimeter: " + shape.getPerimeter());
        System.out.println("Shape area: " + shape.getArea());
        System.out.println("Circle perimeter: " + circle.getPerimeter());
        System.out.println("Circle area: " + circle.getArea());
    }
}
