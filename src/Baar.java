public class Baar extends Vastane {

    public Baar(String nimi, int elud, double kaitsePrtosent, int rynda_dmg) {
        super(nimi, elud, kaitsePrtosent, rynda_dmg);
    }
    @Override
    public void ryndeBoost() {
        super.ryndeBoost();

        System.out.println(this.toString() + " turva ei lase sind välja, pead joogi ostma.");
    }
}
