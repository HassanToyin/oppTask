package ClassAndObject;

public class main {
    public static void main(String[]args){
        car myCar = new car("benz","SUV",2015);
        car mySecondCar = new car("toyota","camry",2018);

        myCar.start();
        mySecondCar.stop();
    }
}
