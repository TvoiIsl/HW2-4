import Transport.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("Легковые авто");
        DriverB driverB1 = new DriverB("MishaB",true,3);
        PassengerCar car1 = new PassengerCar("Lada", "Granta", 1.6, driverB1, BodyType.SEDAN);
        System.out.println(car1);
        DriverB driverB2 = new DriverB("MaxB",true,2);
        PassengerCar car2 = new PassengerCar("Mercedes", "G-Class", 5.5, driverB2, BodyType.SUV);
        System.out.println(car2);
        DriverB driverB3 = new DriverB("NikitaB",true,1);
        PassengerCar car3 = new PassengerCar("Lada", "Niva", 1.6, driverB3,BodyType.SUV);
        System.out.println(car3);
        DriverB driverB4 = new DriverB("RomaB",true,3);
        PassengerCar car4 = new PassengerCar("Toyota", "Camry", 3.5,driverB4,BodyType.SEDAN);
        System.out.println(car4);
        System.out.println("Грузовые авто");
        DriverC driverC1 = new DriverC("MishaC",true,3);
        Truck truck1 = new Truck("Kamaz", "Master", 13,driverC1, LoadCapacity.N3);
        System.out.println(truck1);
        DriverC driverC2 = new DriverC("MaxC",true,2);
        Truck truck2 = new Truck("MAN", "TGL", 10,driverC2,LoadCapacity.N3);
        System.out.println(truck2);
        DriverC driverC3 = new DriverC("NikitaC",true,1);
        Truck truck3 = new Truck("GAZ", "66", 5,driverC3,LoadCapacity.N2);
        System.out.println(truck3);
        DriverC driverC4 = new DriverC("RomaC",true,3);
        Truck truck4 = new Truck("Ural", "4320", 15,driverC4,LoadCapacity.N3);
        System.out.println(truck4);
        System.out.println("Автобусы");
        DriverD driverD1 = new DriverD("MishaD",true,3);
        Bus bus1 = new Bus("Liaz", "X1", 6.5,driverD1,Capacity.AVERAGE);
        System.out.println(bus1);
        DriverD driverD2 = new DriverD("MaxC",true,2);
        Bus bus2 = new Bus("PAZ", "Y-3", 4.5,driverD2,Capacity.SMALL);
        System.out.println(bus2);
        DriverD driverD3 = new DriverD("NikitaC",true,1);
        Bus bus3 = new Bus("MAN", "Lion's Coach", 6,driverD3, Capacity.BIG);
        System.out.println(bus3);
        DriverD driverD4 = new DriverD("RomaC",true,3);
        Bus bus4 = new Bus("PAZ", "X", 5.5,driverD4, Capacity.SMALL);
        System.out.println(bus4);
        conclusion(car1);
        conclusion(car2);
        conclusion(car3);
        conclusion(car4);
        conclusion(truck1);
        conclusion(truck2);
        conclusion(truck3);
        conclusion(truck4);
        conclusion(bus1);
        conclusion(bus2);
        conclusion(bus3);
        conclusion(bus4);

    }
    private static void conclusion (Transport<?> transport){
        System.out.println(" Водитель "+transport.getDriver().getFIO()+" управляет автомобилем "+ transport.getBrand()+" и будет участвовать в заезде. ");
    }
}