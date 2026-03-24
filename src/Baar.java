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
        if (this.getTegevus()==Tegevus.KAITSE)
            System.out.println("Turvamees märkas sind - " + this.getNimi() + " kaotas ainult " + dmg + " elu.");
        else {
            int lauseValik = (int) (Math.random() * 3) + 1;
            switch (lauseValik) {
                case 1:
                    System.out.println("Lõhkusid " + this.getNimi() + "akna. " + this.getNimi() + "kaotas " + dmg + " elu.");

                case 2:
                    System.out.println("Jätsid WC-s kraani jooksma. " + this.getNimi() + " kaotas " + dmg + " elu.");

                case 3:
                    System.out.println("Vajutasid seinapealsest lülitist kõik tuled kustu." + this.getNimi() + " kaotas " + dmg + " elu.");
            }
        }
        return super.kaotaElud(dmg);
    }
}
