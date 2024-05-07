package inheritance;

public class main {
    public static void main(String[] args){
        Rectangle rectangle = new Rectangle(5,4);
        Rectangle.Circle circle = new Rectangle.Circle(5);

        System.out.println("Rectangle Area: " + rectangle.calculateArea());
        System.out.println("Rectangle Perimeter: " + rectangle.calculatePerimeter());

        System.out.println("Circle Area: " + circle.calculateArea());
        System.out.println("circle Perimeter: " + circle.calculatePerimeter());
    }
}
