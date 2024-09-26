package Spells;

public abstract class Spell {
    private String  title;
    private String effect;
    private boolean status;

    public Spell(String title, String effect, boolean status) {
        this.title = title;
        this.effect = effect;
        this.status = status;
    }

    public String getTitle() {
        return title;
    }

    public String getEffect() {
        return effect;
    }

    public boolean isStatus() {
        return status;
    }

    public abstract void  doMagic();
}
