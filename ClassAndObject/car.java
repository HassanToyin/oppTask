package ClassAndObject;

public class car {
    private String brand;
    private String model;
    private int year;

    public car(String brand,String model,int year) {
        this.brand = brand;
        this.model = model;
        this.year = year;
    }

    public void start(){
        System.out.println("starting the car");
    }

    public void stop(){
        System.out.println("stopping the car");
    }

}
