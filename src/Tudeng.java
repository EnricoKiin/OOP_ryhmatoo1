public class Tudeng extends Tegelane{

    private Tegevus tegevus;
    private int punkte;

    public Tudeng(String nimi, int elud, double kaitseProtsent, int rynda_dmg) {
        super(nimi, elud, kaitseProtsent, rynda_dmg);
        this.punkte = 0;
    }

    public void saaStippi() {
        int maxElud = this.getMaxElud();
        int hetkelElud = this.getElud();

        int elusidJuurde = (int)(maxElud * 0.2);
        if (hetkelElud + elusidJuurde > maxElud) {
            this.setElud(maxElud);
        }
        else {
            this.setElud(hetkelElud + elusidJuurde);
        }
    }

    public void lisaPunkte(int punkteJuurde) {
        this.punkte += punkteJuurde;
    }

    public int getPunkte() {
        return this.punkte;
    }

    @Override
    public boolean kaotaElud(int dmg) {
        super.kaotaElud(dmg);

    }
}
