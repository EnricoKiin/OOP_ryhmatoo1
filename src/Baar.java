import java.util.ArrayList;
import java.util.List;

public class Baar extends Vastane {
    private List<String> ryndamiseLaused;
    private List<String> kaitsmiseLaused;

    public Baar(String nimi, int elud, double kaitsePrtosent, int rynda_dmg) {
        super(nimi, elud, kaitsePrtosent, rynda_dmg);
        this.ryndamiseLaused  = new ArrayList<>();
        this.kaitsmiseLaused = new ArrayList<>();

    }
    @Override
    public void ryndeBoost() {
        super.ryndeBoost();

        System.out.println(this.toString() + " turva ei lase sind välja, pead joogi ostma.");
    }
}
