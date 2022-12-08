public class Main {
    public static void main(String[] args) {
        Equipment equipment = new Equipment(5.5, "Ибраимова 103");
        Suv suv = new Suv(equipment, ColorCar.BLACK, 2000, "V8");
        System.out.println(suv.getInfo());
        suv.makeVois();
        suv.makeVois(String.format("Бип бип бип"));
        System.out.println("-----------------------------");
        Equipment equipment1 = new Equipment(3.2, "Чуй 108");
        Mers mers = new Mers(equipment1,ColorCar.WHITE,1990,"Jz","Mers");
        System.out.println(mers.getInfo());
        mers.makeVois();
        mers.makeVois(String.format("Бап бап бап"));
        System.out.println("-----------------------------");
        Equipment equipment2 =new Equipment(9.9,"Киев 132");
        Mers mers1 = new Mers(equipment2,ColorCar.GREY,2100,"V6","Mers600");
        System.out.println(mers1.getInfo());
        mers1.makeVois();
        mers1.makeVois(String.format("Паап паап паап"));
    }
}