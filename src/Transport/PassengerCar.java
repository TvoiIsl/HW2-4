package Transport;

public class PassengerCar extends Transport<DriverB> {
    private BodyType bodyType;

    public PassengerCar(String brand, String model, double engineCapacity, DriverB driver, BodyType bodyType) {
        super(brand, model, engineCapacity, driver);
        this.bodyType=bodyType;
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
    public BodyType getBodyType(){

        return bodyType;
    }
    @Override
    public void printType() {
        if (getBodyType() == BodyType.SEDAN) {
            System.out.println("Седан");
        }else if (getBodyType() == BodyType.HATCHBACK) {
            System.out.println("Хетчбек");
        } else if (getBodyType() == BodyType.CROSSOVER) {
            System.out.println("Кроссовер");
        } else if (getBodyType() == BodyType.COUPE) {
            System.out.println("Купе");
        } else if (getBodyType() == BodyType.VAN) {
            System.out.println("Фургон");
        } else if (getBodyType() == BodyType.MINIVAN) {
            System.out.println("Минивэн");
        } else if (getBodyType() == BodyType.PICKUP) {
            System.out.println("Пикап");
        } else if (getBodyType() == BodyType.SUV) {
            System.out.println("Внедорожник");
        } else if (getBodyType() == BodyType.STATION_WAGON) {
            System.out.println("Универсал");
        } else {
            System.out.println("Данных по транспортному средству недостаточно");
        }
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
