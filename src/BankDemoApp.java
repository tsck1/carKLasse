public class BankDemoApp {
    public static void main(String[] args) {
        //int counter =1;

        System.out.println(Konto.s_anzahlKonto);
       Konto.s_anzahlKonto =100;
       Konto max = new Konto("Max Mustermann");
       max.setInhaber("Max Mustermann");
       //max.getIdNumber();


        max.print();


        Konto susi= new Konto("Susi sorglos");
        susi.setInhaber("Susi sorglos");

        susi.abbuchen(200);
        susi.print();


        max.aufbuchen(1000);
        max.print();
        Konto.s_anzahlKonto=100;
      //susi.getIdNumber();
        max.abbuchen(800);
        max.print();

        max.abbuchen(300);

        susi.aufbuchen(100000);
        susi.print();

    }
}
