package Transport;

public enum LoadCapacity {
    N1(null,3.5f),
    N2(3.5f,12f),
    N3(12f,null);

    private final Float loadCapacity1;
    private final Float loadCapacity2;

    LoadCapacity(Float loadCapacity1, Float loadCapacity2) {
        this.loadCapacity1 = loadCapacity1;
        this.loadCapacity2 = loadCapacity2;
    }

    public double getLoadCapacity1() {
        return loadCapacity1;
    }
    public double getLoadCapacity2() {
        return loadCapacity2;
    }
    public String toString() {
        String x;
        if(loadCapacity1 == null){
            x = "Грузоподъемность: \"до "+ loadCapacity2 +" тонн.\"";
        }
        else if(loadCapacity2 == null){
            x = "Грузоподъемность: \"от "+ loadCapacity1 +" тонн.\"";
        }else {
            x = "Грузоподъемность: \" от "+loadCapacity1+" тонн до "+loadCapacity2+" тонн";
        }

        return x;
    }

}
