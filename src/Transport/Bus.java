package Transport;

import Transport.Exception.DiagnosticException;

import java.util.Map;

public class Bus extends Transport<DriverD> {
    private Capacity capacity;

    public Bus(String brand, String model, double engineCapacity, DriverD driver, Map<Transport,Mechanic> mechanic, Capacity capacity) {
        super(brand, model, engineCapacity, driver, mechanic);
        this.capacity=capacity;
    }

    @Override
    public boolean diagnostics() throws DiagnosticException {
        return false;
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

    public Capacity getCapacity() {
        return capacity;
    }
    public void printType() {
        if(getCapacity() == Capacity.ESPECIALLY_SMALL ){
            System.out.println("До 10");
        } else if(getCapacity() == Capacity.SMALL) {
            System.out.println("До до 25");
        }else if(getCapacity() == Capacity.AVERAGE) {
            System.out.println("От 40 до 50");
        }else if(getCapacity() == Capacity.BIG) {
            System.out.println("От 60 до 80");}
        else if(getCapacity() == Capacity.EXTRA_LARGE) {
            System.out.println("От 100 до 120");}
        else {
            System.out.println("Данных по транспортному средству недостаточно");
        }

    }
}
