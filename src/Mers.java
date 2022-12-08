public final class Mers extends Suv {
    private String title;

    public Mers(Equipment equipment, ColorCar colorCar, int yearOfIssue, String motor, String title) {
        super(equipment, colorCar, yearOfIssue, motor);
        this.title = title;
    }

    @Override
    public String getInfo() {
        return super.getInfo() +
                "\nTitle: " + title;
    }
}
