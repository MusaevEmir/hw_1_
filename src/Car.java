public class Car {
    private Equipment equipment;
    private ColorCar colorCar;

    public Car(Equipment equipment, ColorCar colorCar) {
        this.equipment = equipment;
        this.colorCar = colorCar;
    }

    public Equipment getEquipment() {
        return equipment;
    }

    public ColorCar getColorCar() {
        return colorCar;
    }

}
