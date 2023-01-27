package Transport;

public class Truck extends Transport<DriverC>{

    public Truck(String brand, String model, double engineCapacity, DriverC driver) {
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
        System.out.println("Пит-стоп грузового авто");
    }

    @Override
    public void bestLapTime() {
        int minTime = 80;
        int maxTime = 140;
        int time = (int) (minTime + (maxTime-minTime)*Math.random());
        System.out.println ("Лучшее время круга грузового авто "+time);
    }

    @Override
    public void maxSpeed() {
        int minSpeed = 130;
        int maxSpeed = 180;
        int speed = (int) (minSpeed + (maxSpeed-minSpeed)*Math.random());
        System.out.println("Максимальная скорость грузового авто "+speed);
    }
}
