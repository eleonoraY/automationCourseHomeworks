package Lecture11;

public class WashingMachine extends Appliance{
    public double loadCapacity;

    public WashingMachine(String brand, double consumption, double loadCapacity){
        super(brand, consumption);
        this.loadCapacity = loadCapacity;
    }


    public void startWashCycle(){
        if(isTurnedOn == true){
            System.out.println("Start washing cycle.");
        }else {
            System.out.println("You should turn on the washing machine first to start the washing cycle.");
        }
    }

    @Override
    public void showInfo(){
        super.showInfo();
        System.out.println("This is washing machine with " + loadCapacity + " kg load capacity.");
    }


    @Override
    public void factoryReset(){
        super.factoryReset();
        loadCapacity = 0;
    }

}
