package org.hogwards.items;

public class Cloak implements Invisible {
    private int capacity;
    private int weight;

    public Cloak( int capacity, int weight) {
        this.capacity = capacity;
        this.weight = weight;
    }

    public int getCapacity() {
        return capacity;
    }

    public int getWeight() {
        return weight;
    }

    @Override
    public void becomeInvisible (){
        System.out.println(this.capacity + " People is invisible");
    }

    @Override
    public void becomeVisible (){
        System.out.println(" People is visible");
    }
}
