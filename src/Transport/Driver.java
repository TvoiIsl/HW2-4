package Transport;

public abstract class Driver {
    private String FIO;
    private boolean driverLicense;
    private int experience;
    public Driver(String FIO, boolean driverLicense, int experience){
        this.FIO=FIO;
        this.driverLicense=driverLicense;
        this.experience=experience;
    }
    public abstract void startMoving();
    public abstract void stop();
    public abstract void refuel();

    public String getFIO() {
        return FIO;
    }

    public void setFIO(String FIO) {
        this.FIO = FIO;
    }

    public boolean isDriverLicense() {
        return driverLicense;
    }

    public void setDriverLicense(boolean driverLicense) {
        this.driverLicense = driverLicense;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }
}
