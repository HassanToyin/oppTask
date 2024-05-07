public class car {
    public String brand;
    public String model;
    public int year;
    private boolean isRunning;

    public car(String brand, String model, String year) {
        this.brand = brand;
        this.model = model;
        this.year = Integer.parseInt(year);
        this.isRunning = false;

    }

    public car(String honda, String accord, int i) {
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public boolean isRunning() {
        return isRunning;
    }

    public void setRunning(boolean running) {
        isRunning = running;
    }

    public void start() {

            System.out.println("car has started.");
        }

    public void stop() {
        System.out.println("car has stopped");
    }

    }
    