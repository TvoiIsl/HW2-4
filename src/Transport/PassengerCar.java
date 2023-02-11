package Transport;

import Transport.Exception.DiagnosticException;

import java.util.Map;
import java.util.Objects;

public class PassengerCar extends Transport<DriverB> {
    private BodyType bodyType;


    public PassengerCar(String brand, String model, double engineCapacity, DriverB driver, Map<Transport,Mechanic> mechanic, BodyType bodyType) {
        super(brand, model, engineCapacity, driver,mechanic);
        this.bodyType=bodyType;
    }

//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//        if (!super.equals(o)) return false;
//        PassengerCar that = (PassengerCar) o;
//        return mechanic.equals(that.mechanic);
//    }
//
//    @Override
//    public int hashCode() {
//        return Objects.hash(super.hashCode(), mechanic);
//    }

    @Override
    public boolean diagnostics() throws DiagnosticException {
        if (getDriver().isDriverLicense()==false){
            throw new DiagnosticException("Необходимо укзать тип прав");
        }else {
            return true;
        }
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
