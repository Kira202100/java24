package Spells;

public class ExpendingSpell  extends  Spell {
    public ExpendingSpell(String title, String effect, boolean status) {
        super(title, effect, status);
    }

    @Override
    public void doMagic() {
        System.out.println("Spell");
    }
}
