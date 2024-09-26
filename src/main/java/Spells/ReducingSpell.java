package Spells;

public class ReducingSpell extends Spell {
    public ReducingSpell(String title, String effect, boolean status) {
        super(title, effect, status);
    }
    @Override
    public void doMagic() {
        System.out.println("Spell  reducing");
    }
}
