package Device;

public class SmartLight  extends IoTDevice {
    private boolean isOn;

    public SmartLight(int id, String name, boolean isOn) {
        super(id, name);
        this.isOn = isOn;
    }

    public boolean isOn() {
        return isOn;
    }

    @Override
    public void perfomAction() {
//        System.out.println("Light on - " + isOn);
        if (isOn) {
            System.out.println("Turning off smart light: " + getName() + " on");
        } else {
            System.out.println("Turning on smart light: " + getName() + " out");
        }
    }
}
