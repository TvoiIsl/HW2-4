package Transport;

public class DriverB extends Driver{

    public DriverB(String FIO, boolean driverLicense, int experience) {
        super(FIO, driverLicense, experience);
    }

    @Override
    public void startMoving() {
        System.out.println("Водитель"+getFIO()+"категории B начал движение");
    }

    @Override
    public void stop() {
        System.out.println("Водитель"+getFIO()+"категории B остановился");
    }

    @Override
    public void refuel() {
        System.out.println("Водитель"+getFIO()+"категории B заправляет транспорт");
    }
}
