package Lecture11;

public class Microwave extends Appliance{
    public double maxTemperature;
    public double currentTemperature;
    public int capacity;
    public int currentLoad;

    public Microwave(String brand, double consumption, double maxTemperature, double currentTemperature, int capacity, int currentLoad){
        super(brand, consumption);
        this.maxTemperature = maxTemperature;
        this.currentTemperature = currentTemperature;
        this.capacity = capacity;
        this.currentLoad = currentLoad;

    }

    public void setTemperature(){
        if(currentTemperature < 10){
            currentTemperature = 10;
        }else if(currentTemperature > maxTemperature){
            currentTemperature = maxTemperature;
        }
    }

    public void heat(){
        if(currentTemperature != 0){
            System.out.println("The heating is started!");
        }else{
            System.out.println("The heating cannot be started because the temperature should be greater than 0 degrees!");
        }
    }

    public void addFood(double liters){
        if(liters > capacity){
            System.out.println("The food cannot be added because it exceeds the capacity!");
        }else{
            currentLoad += liters;
            System.out.println("The food is added.");
        }
    }

    @Override
    public void showInfo(){
        super.showInfo();
        System.out.println("This is a microwave with maxTemperature " + maxTemperature + " degrees and capacity " + capacity + " L. The current temperature is set to " + currentTemperature + " and the currentLoad is " + currentLoad + " L.");
    }

    @Override
    public void factoryReset(){
        super.factoryReset();
        currentTemperature = 0;
        currentLoad = 0;
    }


}
