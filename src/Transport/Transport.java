package Transport;

public abstract class Transport<T extends Driver> implements Competing {
    private final String brand;
    private final String model;
    private double engineCapacity;
    private T driver;

    public Transport(String brand, String model, double engineCapacity,T driver) {
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
