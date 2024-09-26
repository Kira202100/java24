package Device;

public class IoTDevice {
    private int id;
    private String name;

    public IoTDevice(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void perfomAction (){
        System.out.println("Perfom action device " + name);
    }
}
