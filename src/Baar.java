import java.util.ArrayList;

public class Baar extends Vastane {

    public Baar(String nimi, int elud, double kaitseProtsent, int rynda_dmg) {
        super(nimi, elud, kaitseProtsent, rynda_dmg);
        lisaRyndelaused();
    }
    @Override
    public void ryndeBoost() {
        super.ryndeBoost();

        System.out.println(this.toString() + " turva ei lase sind välja, pead joogi ostma.");
    }

    @Override
    public void lisaRyndelaused() {
        String[] laused = {"Turva ei usu su vanust. Võtab su ID kaardi ära",
                "WC järrjekorras on 5 inimest. Pead vastu pidama",
                "Baari tuleb sõber, kellele oled võlgu. Pead joogi välja tegema",
                "Jõid liiga palju, pead oksendama.",
                "Keegi müksas su vastu, su jook lendas maha.",
        };
        setRyndeLaused(laused);
    }

    @Override
    public void kaotaElud(int dmg) {
        if (this.getTegevus()==Tegevus.KAITSE)
            System.out.println("Turvamees märkas sind - " + this.getNimi() + " kaotas ainult " + dmg + " elu.");
        else {
            int lauseValik = (int) (Math.random() * 3) + 1;
            switch (lauseValik) {
                case 1:
                    System.out.println("Lõhkusid " + this.getNimi() + " akna. ");
                    break;

                case 2:
                    System.out.println("Jätsid WC-s kraani jooksma.");
                    break;

                case 3:
                    System.out.println("Vajutasid seinapealsest lülitist kõik tuled kustu.");
                    break;
            }
            System.out.println(this.getNimi() + " kaotas " + dmg + " elu.");
        }

        super.kaotaElud(dmg);
    }
}
