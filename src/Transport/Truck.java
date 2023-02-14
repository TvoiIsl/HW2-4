package Transport;

import Transport.Exception.DiagnosticException;

import java.util.Map;
import java.util.Objects;

public class Truck extends Transport<DriverC>{
    private LoadCapacity loadCapacity;
//    private Map<Transport,Mechanic> mechanic ;

    public Truck(String brand, String model, double engineCapacity, DriverC driver, Map<Transport,Mechanic> mechanic, LoadCapacity loadCapacity) {
        super(brand, model, engineCapacity, driver,mechanic);
        this.loadCapacity=loadCapacity;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Truck truck = (Truck) o;
        return loadCapacity == truck.loadCapacity;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), loadCapacity);
    }

    //    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//        if (!super.equals(o)) return false;
//        Truck truck = (Truck) o;
//        return mechanic.equals(truck.mechanic);
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

    public LoadCapacity getLoadCapacity() {
        return loadCapacity;
    }
    public void printType() {
        if (getLoadCapacity() == LoadCapacity.N1){
            System.out.println("До 3.5");
        }else if(getLoadCapacity() == LoadCapacity.N2){
            System.out.println("От 3.5 до 12");
        } else if (getLoadCapacity() == LoadCapacity.N3){
            System.out.println("От 12");
        } else {
            System.out.println("Данных по транспортному средству недостаточно");
        }
    }
}
