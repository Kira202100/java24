package Device;

public class SmartTermostat extends IoTDevice {
    private int temperature;

    public SmartTermostat(int id, String name, int temperature) {
        super(id, name);
        this.temperature = temperature;
    }
    @Override
    public void perfomAction (){
        System.out.println("Temperature " + getName() + temperature);
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }
}
