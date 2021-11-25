import javax.sound.midi.Soundbank;

public class CarDemoApp {

    public static void main(String[] args) {


            int number =7;
        String number1 = "Seven";
        System.out.println(number1+number);

        Car golf_5_G334T = new Car();
        Car fiatPanda_G_1234T = new Car();
        Car opel = new Car();

        golf_5_G334T.setManufacturer("Fiat");
        golf_5_G334T.model = "Golf V";
        golf_5_G334T.horsePower = 90;
        golf_5_G334T.color = "black";
        golf_5_G334T.co2Emission = 300;

        opel.setManufacturer("Opel1");
        opel.model="corsa";
        opel.productionYear="2010";
        opel.horsePower=55;
        opel.color="red";
        opel.co2Emission=153;



        fiatPanda_G_1234T.setManufacturer("FIAT");
        fiatPanda_G_1234T.model = "Panda";
        fiatPanda_G_1234T.color = "red";
        fiatPanda_G_1234T.horsePower = 80;
        fiatPanda_G_1234T.co2Emission = 120;


        Car golf5_LB_345U = new Car();
        Car golf5_LB_789Z = new Car();

        golf5_LB_345U.model ="Golf V";
        golf5_LB_789Z.model ="Golf V";

        System.out.println("Golf 5 aus Graz: "  + golf_5_G334T.co2Emission);
        System.out.println("Fiat: "  + fiatPanda_G_1234T.model);

        opel.accelerate(220);
        opel.accelerate(215);

        System.out.println("Opel aus Gratkorn mit "+opel.co2Emission+" mg CO2");




    }
}
