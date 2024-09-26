package Device;

public class Main {
    public static void main(String[] args) {
    SmartLight smartLight = new SmartLight(23,"lamp",true);
    SmartTermostat smartTermostat = new SmartTermostat(45,"toster", 36);

    smartLight.perfomAction();
    smartTermostat.perfomAction();
    smartTermostat.setTemperature(42);
    smartTermostat.perfomAction();


    }
}
