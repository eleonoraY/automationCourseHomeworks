package Lecture11;

public class exercise2 {
    public static void main(String[] args) {
        WashingMachine washingMachineAppliance = new WashingMachine("AEG", 1400, 8);
        washingMachineAppliance.showInfo();
        washingMachineAppliance.turnOn();
        washingMachineAppliance.startWashCycle();
        washingMachineAppliance.factoryReset();
        washingMachineAppliance.showInfo();

        Refrigerator refrigeratorAppliance = new Refrigerator("Beko", 80);
        refrigeratorAppliance.setRefrigeratorTemperature(-6);
        refrigeratorAppliance.showInfo();
        refrigeratorAppliance.factoryReset();
        refrigeratorAppliance.showInfo();

        Microwave microwaveAppliance = new Microwave("Samsung", 800, 200, 50, 3, 2);
        microwaveAppliance.showInfo();
        microwaveAppliance.setTemperature();
        microwaveAppliance.heat();
        microwaveAppliance.addFood(5);
        microwaveAppliance.factoryReset();
        microwaveAppliance.showInfo();

        Microwave microwaveAppliance2 = new Microwave("Sony", 500, 100, 150, 3, 1);
        microwaveAppliance2.showInfo();
        microwaveAppliance2.setTemperature();
        microwaveAppliance2.heat();
        microwaveAppliance2.addFood(1);
        microwaveAppliance2.factoryReset();
        microwaveAppliance2.showInfo();


    }
}
