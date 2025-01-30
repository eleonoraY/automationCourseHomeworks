package Lecture11;

public class Appliance {
    public String brand;
    public double consumption;
    public boolean isTurnedOn;


    public Appliance(String brand, double consumption){
        this.brand = brand;
        this.consumption = consumption;
    }

    public void turnOn(){
        isTurnedOn = true;
        System.out.println("The appliance is turned on.");
    }

    public void turnOff(){
        isTurnedOn = false;
        System.out.println("The appliance is turned off.");
    }

    public void showInfo(){
        System.out.println("The appliance brand is " + brand + " and it's consumption is " + consumption + ".");
    }

    public void factoryReset(){
        isTurnedOn = false;
        System.out.println("---- This is appliance information after reset ----");
    }


}
