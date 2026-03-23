public class Baar extends Vastane {

    public Baar(String nimi, int elud, double kaitseProtsent, int rynda_dmg) {
        super(nimi, elud, kaitseProtsent, rynda_dmg);
    }
    @Override
    public void ryndeBoost() {
        super.ryndeBoost();

        System.out.println(this.toString() + " turva ei lase sind välja, pead joogi ostma.");
    }

    @Override
    public boolean kaotaElud(int dmg) {
        return super.kaotaElud(dmg);
    }
}
