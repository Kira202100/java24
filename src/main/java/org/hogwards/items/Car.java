package org.hogwards.items;

import org.hogwards.Student;

public class Car implements Invisible {
    private String driver;
    private int speed;
    private boolean isFlying;

    public Car( int speed, boolean isFlying) {
        this.speed = speed;
        this.isFlying = isFlying;
    }

    public String getDriver() {
        return driver;
    }

    public int getSpeed() {
        return speed;
    }

    public boolean isFlying() {
        return isFlying;
    }

    public void setDriver(Student student) {

        this.driver = driver;
    }

    @Override
    public void becomeInvisible (){

        System.out.println(" Car  is invisible");
    }

    @Override
    public void becomeVisible (){
        System.out.println(" Car is visible");
    }
}
