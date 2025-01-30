package Lecture11;

public class Refrigerator extends Appliance{
    public double temperature;

    public Refrigerator(String brand, double consumption){
        super(brand, consumption);
    }

    public void setRefrigeratorTemperature(double temperature){
        if(temperature < -3 || temperature > 5){
            this.temperature = 0;
        }
        else{
            this.temperature=temperature;
        }
    }

    @Override
    public void showInfo(){
        super.showInfo();
        System.out.println("This is refrigerator. The temperature is set to " + temperature + " Celsius.");
    }

    @Override
    public void factoryReset(){
        super.factoryReset();
        temperature = 0;
    }

}
