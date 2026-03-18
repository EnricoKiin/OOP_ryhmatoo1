public class Tudeng extends Tegelane{

    private Tegevus tegevus;

    public Tudeng(String nimi, int elud, double kaitsePrtosent, int rynda_dmg) {
        super(nimi, elud, kaitsePrtosent, rynda_dmg);
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
}
