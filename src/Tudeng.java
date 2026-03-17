public class Tudeng{

    private int pangakonto;
    private int rynda_stat;
    private boolean kaitse;

    public Tudeng(int pangakonto) {
        this.pangakonto = pangakonto;
        this.kaitse = false;
    }

    public void rynda(Vastane vastane) {
        int dmg = this.rynda_stat;
        if (vastane.getKaitseb()) {
            dmg = (int)(dmg * 0.5);
        }

        int uuedVastaseElud;
        uuedVastaseElud = vastane.getElud() - this.rynda_stat;
    }

    public void kaitse(Vastane vastane) {

    }

    public void saaStippi(Vastane vastane) {
    }
}
