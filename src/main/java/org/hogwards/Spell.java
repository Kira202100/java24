package org.hogwards;

import java.util.Random;

public class Spell {
    private String title;
    private int power = new Random().nextInt(1,7);

    public Spell(String title) {
        this.title = title;
//        this.power = power;
    }

    public String getTitle() {

        return title;
    }

    public int getPower() {

        return power;
    }

    public void setTitle(String title) {

        this.title = title;
    }

    public void setPower(int power) {

        this.power = power;
    }
}
