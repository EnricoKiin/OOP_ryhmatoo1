public class Tudeng{

    private int pangakonto;
    private int rynda_stat;
    private boolean kaitse;

    public Tudeng(int pangakonto) {
        this.pangakonto = pangakonto;
        this.kaitse = false;
    }

    public void ryndab(Vastane vastane) {
        int uuedVastaseElud;
        uuedVastaseElud = vastane.getElud() - this.rynda_stat;
    }

    public void kaitse() {

    }
}
