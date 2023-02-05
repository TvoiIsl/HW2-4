import Transport.*;
import Transport.Exception.DiagnosticException;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        ServiceStation serviceStation= new ServiceStation();

        List<Transport> cars = new ArrayList<>();
        List<Mechanic> mechanics = new ArrayList<>();

        Mechanic Vadik = new Mechanic("Vadik", "WAG");
        Mechanic Slava = new Mechanic("Slava", "BMW");
        Mechanic Yarik = new Mechanic("Yarik", "MAN");

        DriverB driverB1 = new DriverB("MishaB",false,3);
        DriverB driverB2 = new DriverB("MaxB",true,2);
        DriverB driverB3 = new DriverB("NikitaB",true,1);
        DriverB driverB4 = new DriverB("RomaB",true,3);
        DriverC driverC1 = new DriverC("MishaC",true,3);
        DriverC driverC2 = new DriverC("MaxC",true,2);
        DriverC driverC3 = new DriverC("NikitaC",true,1);
        DriverC driverC4 = new DriverC("RomaC",true,3);
        DriverD driverD1 = new DriverD("MishaD",true,3);
        DriverD driverD2 = new DriverD("MaxC",true,2);
        DriverD driverD3 = new DriverD("NikitaC",true,1);
        DriverD driverD4 = new DriverD("RomaC",true,3);


        PassengerCar car1 = new PassengerCar("Lada", "Granta", 1.6, driverB1,mechanics, BodyType.SEDAN);
        PassengerCar car2 = new PassengerCar("Mercedes", "G-Class", 5.5, driverB2,mechanics, BodyType.SUV);
        PassengerCar car3 = new PassengerCar("Lada", "Niva", 1.6, driverB3,mechanics,BodyType.SUV);
        PassengerCar car4 = new PassengerCar("Toyota", "Camry", 3.5,driverB4,mechanics, BodyType.SEDAN);
        Truck truck1 = new Truck("Kamaz", "Master", 13,driverC1,mechanics, LoadCapacity.N3);
        Truck truck2 = new Truck("MAN", "TGL", 10,driverC2,mechanics,LoadCapacity.N3);
        Truck truck3 = new Truck("GAZ", "66", 5,driverC3,mechanics,LoadCapacity.N2);
        Truck truck4 = new Truck("Ural", "4320", 15,driverC4,mechanics,LoadCapacity.N3);
        Bus bus1 = new Bus("Liaz", "X1", 6.5,driverD1,mechanics,Capacity.AVERAGE);
        Bus bus2 = new Bus("PAZ", "Y-3", 4.5,driverD2,mechanics,Capacity.SMALL);
        Bus bus3 = new Bus("MAN", "Lion's Coach", 6,driverD3, mechanics,Capacity.BIG);
        Bus bus4 = new Bus("PAZ", "X", 5.5,driverD4, mechanics,Capacity.SMALL);


        mechanics.add(Vadik);
        mechanics.add(Slava);
        mechanics.add(Yarik);
        printSs(car1);

        serviceStation.autoQueue(car2);
        serviceStation.autoQueue(car3);
//        serviceStation.passed();
        serviceStation.queue();

//        System.out.println("Легковые авто");
//        System.out.println(car1);
//        System.out.println(car2);
//        System.out.println(car3);
//        System.out.println(car4);
//        System.out.println("Грузовые авто");
//        System.out.println(truck1);
//        System.out.println(truck2);
//        System.out.println(truck3);
//        System.out.println(truck4);
//        System.out.println("Автобусы");
//        System.out.println(bus1);
//        System.out.println(bus2);
//        System.out.println(bus3);
//        System.out.println(bus4);







//        conclusion(car1);
//        conclusion(car2);
//        conclusion(car3);
//        conclusion(car4);
//        conclusion(truck1);
//        conclusion(truck2);
//        conclusion(truck3);
//        conclusion(truck4);
//        conclusion(bus1);
//        conclusion(bus2);
//        conclusion(bus3);
//        conclusion(bus4);

//        try {
//            car1.diagnostics();
//        } catch (DiagnosticException e) {
//            System.out.println("Ошибка при диагностики транспорта");
//        }
//        try {
//            bus1.diagnostics();
//        } catch (DiagnosticException e) {
//            System.out.println("Ошибка при диагностики транспорта");
//        }

    }
    private static void conclusion (Transport<?> transport){
        System.out.println(" Водитель "+transport.getDriver().getFIO()+" управляет автомобилем "+ transport.getBrand()+" и будет участвовать в заезде. ");
    }
    private static void printSs (Transport<?> transport){
        System.out.println( transport.getBrand()+ ". У водителя "+transport.getDriver().getFIO()+" Есть механики: " + transport.getMechanic().get(0).getName());
    }

}