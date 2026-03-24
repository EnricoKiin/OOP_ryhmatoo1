import java.util.ArrayList;
import java.util.List;

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


    public void kaotaElud(int dmg, Vastane vastane) {
        List<String> vastaseLaused = vastane.getRyndeLaused();

        int valik = (int)(Math.random() * vastaseLaused.size());
        System.out.println(vastaseLaused.get(valik));
        if (this.tegevus == Tegevus.KAITSE) {
            System.out.println("Kuid su lemmik laul hakkas mängima. Kaotad vähem elusid.");
        }
        System.out.println("Kaotasid "  + dmg + " elu");

        super.kaotaElud(dmg);

    }
}
