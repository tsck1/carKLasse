public class PersonDemoApp {


    public static void main(String[] args) {

        Person IWI_1 = new Person();
        Person IWI_2 = new Person();

      IWI_1.firstname ="Thomas" ;
      IWI_1.lastname ="Pontasch";
      IWI_1.age = 49;
      IWI_1.nationality = "AUT";

      IWI_2.firstname ="Max";
      IWI_2.lastname ="Mustermann";

       System.out.println(" Person IWI_1:" +IWI_1.firstname +", "+IWI_1.lastname+ ", "+IWI_1.age+ " Jahre, "+IWI_1.nationality+";");
        System.out.println(" Person IWI_2:" +IWI_2.firstname +", "+IWI_2.lastname+ ", "+IWI_2.age+ " Jahre, "+IWI_2.nationality+";");

       printPerson(IWI_1);
       printPerson(IWI_2);

       IWI_1.print();
       IWI_2.print();



    }


    public static void printPerson(Person p) {

        /*System.out.println(p.firstname + " " +p.lastname + ", " + p.age +" Jahre");*/



    }


}
