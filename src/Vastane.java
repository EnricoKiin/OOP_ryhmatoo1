public class Vastane extends Tegelane{

    private Tegevus tegevus;

    public Vastane(String nimi, int elud, double kaitsePrtosent, int rynda_dmg) {
        super(nimi, elud, kaitsePrtosent, rynda_dmg);
    }

    public void ryndeBoost() {
        int boost = 3;

        this.setRynda_dmg(this.getRynda_dmg() + boost);
    }
}
