public class Vastane extends Tegelane{

    private Tegevus tegevus;
    private int punkteVaart;

    public Vastane(String nimi, int elud, double kaitseProtsent, int rynda_dmg) {
        super(nimi, elud, kaitseProtsent, rynda_dmg);
        this.punkteVaart = arvutaPunkte();
    }

    public int arvutaPunkte() {
        int punkte = (int)(this.getMaxElud() * 0.7) + this.getRynda_dmg() * 4 + (int)(this.getKaitseProtsent() * 10);
        return punkte;
    }

    public int getPunkteVaart() {
        return this.punkteVaart;
    }

    public void ryndeBoost() {
        int boost = 3;

        this.setRynda_dmg(this.getRynda_dmg() + boost);
    }
}
