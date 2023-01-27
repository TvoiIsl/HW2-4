package Transport;

public class Bus extends Transport<DriverD> {

    public Bus(String brand, String model, double engineCapacity, DriverD driver) {
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
        System.out.println("Пит-стоп автобуса");
    }

    @Override
    public void bestLapTime() {
        int minTime = 100;
        int maxTime = 160;
        int time = (int) (minTime + (maxTime-minTime)*Math.random());
        System.out.println ("Лучшее время круга автобуса "+time);
    }

    @Override
    public void maxSpeed() {
        int minSpeed = 110;
        int maxSpeed = 160;
        int speed = (int) (minSpeed + (maxSpeed-minSpeed)*Math.random());
        System.out.println("Максимальная скорость автобуса"+speed);
    }
}
