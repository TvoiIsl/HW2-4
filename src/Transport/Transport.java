package Transport;

import Transport.Exception.DiagnosticException;

import java.util.Map;
import java.util.Objects;

public abstract class Transport<T extends Driver> implements Competing {
    private final String brand;
    private final String model;
    private double engineCapacity;
    private T driver;
    private Map<Transport,Mechanic> mechanic ;

    public abstract boolean diagnostics() throws DiagnosticException;
    public Transport(String brand, String model, double engineCapacity, T driver, Map<Transport,Mechanic> mechanic) {
        if (brand==null || brand.isEmpty()){
            brand="default";
        }
                this.brand = brand;
        if (model==null || model.isEmpty()){
            model="default";
        }
        this.model = model;
        if (engineCapacity <= 0) {
            this.engineCapacity = 2.5;
        } else {
            this.engineCapacity = engineCapacity;
        }
        setDriver(driver);
        setMechanic(mechanic);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Transport<?> transport = (Transport<?>) o;
        return mechanic.equals(transport.mechanic);
    }

    @Override
    public int hashCode() {
        return Objects.hash(mechanic);
    }

    public Map<Transport, Mechanic> getMechanic() {
        return mechanic;
    }

    public void setMechanic(Map<Transport, Mechanic> mechanic) {
        this.mechanic = mechanic;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public double getEngineCapacity() {
        return engineCapacity;
    }

    public void setEngineCapacity(double engineCapacity) {
        this.engineCapacity = engineCapacity;
    }
    public abstract void startMoving();
    public abstract void finishMoving();
    public abstract void printType();
    @Override
    public String toString() {
        return "Марка: " + brand +
                " Модель: " + model +
                " Объем двигателя: " + engineCapacity + " л";
    }

    public T getDriver() {
        return driver;
    }

    public void setDriver(T driver) {
        this.driver = driver;
    }
}
