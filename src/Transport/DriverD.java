package Transport;

public class DriverD extends Driver{
    public DriverD(String FIO, boolean driverLicense, int experience) {
        super(FIO, driverLicense, experience);
    }

    @Override
    public void startMoving() {
        System.out.println("Водитель"+getFIO()+"категории D начал движение");
    }

    @Override
    public void stop() {
        System.out.println("Водитель"+getFIO()+"категории D остановился");
    }

    @Override
    public void refuel() {
        System.out.println("Водитель"+getFIO()+"категории D заправляет транспорт");
    }
}
