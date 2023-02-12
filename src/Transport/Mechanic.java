package Transport;

public class Mechanic {


    private String name;
    private String company;

    public Mechanic(String name, String company) {
        this.name = name;
        this.company = company;
    }
    public void performMaintenance(){
        System.out.println("Провести техобслуживание");
    }
    public void fixTheCar(){
        System.out.println("Починить машину");
    }
    public String getName() {
        return name;
    }

    public String getCompany() {
        return company;
    }
}
