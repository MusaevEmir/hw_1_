public class Suv extends Car {
    private int yearOfIssue;
    private String Motor;

    public Suv(Equipment equipment, ColorCar colorCar, int yearOfIssue, String motor) {
        super(equipment, colorCar);
        this.yearOfIssue = yearOfIssue;
        this.Motor = motor;
    }

    public int getYearOfIssue() {
        return yearOfIssue;
    }

    public String getMotor() {
        return Motor;
    }

    public String getInfo() {
        return "Year of issue: " + yearOfIssue +
                "\nMotor: " + Motor +
                "\nColor car: " + getColorCar() +
                "\nVolume: " + getEquipment().getVolume() +
                "\nDelivery address: " + getEquipment().getDeliveryAddress();
    }

    public void makeVois() {
        System.out.println("Бип");
    }

    public String makeVois(String makeVois) {
        System.out.println(makeVois);
        return null;

    }
}
