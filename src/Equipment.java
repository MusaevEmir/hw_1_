public class Equipment {
    private double volume;
    private String deliveryAddress;

    public Equipment(double volume, String deliveryAddress) {
        this.volume = volume;
        this.deliveryAddress = deliveryAddress;
    }

    public double getVolume() {
        return volume;
    }

    public String getDeliveryAddress() {
        return deliveryAddress;
    }
}
