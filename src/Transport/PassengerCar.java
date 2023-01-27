package Transport;

public class PassengerCar extends Transport<DriverB> {

    public PassengerCar(String brand, String model, double engineCapacity, DriverB driver) {
        super(brand, model, engineCapacity, driver);
    }

    @Override
    public void startMoving(){
        System.out.println(getBrand()+" начал движение!");
    }
    @Override
    public void finishMoving(){
        System.out.println(getBrand()+" закончил движение.");
    }

    @Override
    public void pitStop() {
        System.out.println("Пит-стоп легкового авто");
    }

    @Override
    public void bestLapTime() {
        int minTime = 60;
        int maxTime = 120;
        int time = (int) (minTime + (maxTime-minTime)*Math.random());
        System.out.println ("Лучшее время круга легкового авто "+time);
    }

    @Override
    public void maxSpeed() {
        int minSpeed = 150;
        int maxSpeed = 200;
        int speed = (int) (minSpeed + (maxSpeed-minSpeed)*Math.random());
        System.out.println("Максимальная скорость легкового авто "+speed);
    }
}
