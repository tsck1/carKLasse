public class Car {

    private String manufacturer;
    public String color;
    public String productionYear;
    public String model;
    public int horsePower;
    public double co2Emission;
    private int currentSpeed;


    public void setManufacturer (String manufacturer){
        if (manufacturer.equals("Volkswagen")
            || manufacturer.equals("Fiat")||manufacturer.equals("Opel"))
        this.manufacturer = manufacturer;
    }

    public void accelerate(int newSpeed){
        currentSpeed= newSpeed<220? newSpeed:220;
        String info;
        info="current speed "+currentSpeed;
        if(currentSpeed==220)
            info +=" maximum speed reached";
        System.out.println(info);

    }








}
