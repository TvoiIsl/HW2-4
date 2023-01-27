package Transport;

public class DriverC extends Driver{
    public DriverC(String FIO, boolean driverLicense, int experience) {
        super(FIO, driverLicense, experience);
    }

    @Override
    public void startMoving() {
        System.out.println("Водитель"+getFIO()+"категории C начал движение");
    }

    @Override
    public void stop() {
        System.out.println("Водитель"+getFIO()+"категории C остановился");
    }

    @Override
    public void refuel() {
        System.out.println("Водитель"+getFIO()+"категории C заправляет транспорт");
    }
}
