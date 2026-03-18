public class Vastane {

    private int elud;
    private double kaitsePrtosent;
    private int rynda_dmg;
    private boolean kaitseb;
    private boolean ryndab;

    public Vastane(int elud, double kaitsePrtosent, int rynda_dmg, boolean ryndab, boolean kaitseb) {
        this.elud = elud;
        this.kaitsePrtosent = kaitsePrtosent;
        this.rynda_dmg = rynda_dmg;
        this.ryndab = ryndab;
        this.kaitseb = kaitseb;
    }

    public  void rynda() {
        this.ryndab = true;
    }
    public  void kaitse() {
        this.kaitseb = true;
    }

    public  int getElud() {
        return this.elud;
    }
    public  void setElud(int uuedElud) {
        this.elud = uuedElud;
    }

    public  void kaotaElud(int dmg) {
        if (this.elud - dmg < 0) {
            this.elud = 0;
        }
        else {
            this.elud -= dmg;
        }
    }

    public boolean onElus() {
        if (this.elud != 0) {
            return true;
        }
        return false;
    }

}
