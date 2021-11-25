public class Konto {
    private String inhaber;
    private double kontostand;
    private int idNumber;
    public static int s_anzahlKonto;

    public int getIdNumber() {
        return idNumber;
    }

    public Konto(String inhaber) {
        // Konstruktor
        this.inhaber = inhaber;
        //kontostand = 0;
        this.idNumber = s_anzahlKonto++;
    }

    public void setInhaber(String inhaber) {
        this.inhaber = inhaber;
        kontostand = 0;

    }

    public void aufbuchen(double betrag) {
        if (betrag > 0){
            kontostand = kontostand + betrag;
        }
        else {
            System.out.println("Nur Werte > 0 sind erlaubt!");
        }
    }

    public void abbuchen(double betrag) {
        if (kontostand >= betrag) {
            kontostand -= betrag;
        }
        else {
            System.out.println(inhaber+"Nicht genügend Geld am Konto!");
        }
    }

    public void print() {
        System.out.println( idNumber+ " Kontoinhaber: "
                + inhaber + "; Kontostand: " + kontostand);
    }
}