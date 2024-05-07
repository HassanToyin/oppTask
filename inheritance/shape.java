package inheritance;

public abstract class shape {
    public double calculateArea(){
        return 0.1;
    }
    public double calculatePerimeter(){
        return 0.5;
    }

    public abstract double calculateParimeter();
}

class Rectangle extends shape{
    private double length;
    private double width;

    public  Rectangle(double length, double width){
        this.length = length;
        this.width = width;
    }

    @Override
    public double calculateArea(){
        return length * width;
    }
    @Override
    public double calculateParimeter(){
        return length * width;
    }

static class Circle extends shape{
        private final double radius;

        public Circle (double radius){
            this.radius = radius;
        }


     @Override
     public double calculateArea(){
            return radius;
     }

     @Override
     public double calculateParimeter(){
            return radius;
     }




    }




}
