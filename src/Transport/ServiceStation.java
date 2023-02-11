package Transport;

import java.util.*;

public class ServiceStation {
//    private Queue serviceStation = new LinkedList();
    private Map<Transport,Mechanic>mechanics=new HashMap<>();
    private Set<Driver>driver=new HashSet<>();
    public void addMechanic(Transport transport,Mechanic mechanic){
        mechanics.put(transport,mechanic);
            System.out.println("ТС "+transport.getBrand()+" добавлен механик "+mechanic.getName()+" из компании "+mechanic.getCompany());


    }

    public void allMechanic(){

        System.out.println("Список общий:");
        for (Map.Entry<Transport,Mechanic> mechanicEntry: mechanics.entrySet()){
        System.out.println("ТС "+mechanicEntry.getKey().getBrand()+" имеет механика "+mechanicEntry.getValue().getName()+" и относится к компании "+mechanicEntry.getValue().getCompany());

    }
    }


    public void addDriver(Driver as){
        driver.add(as);
        System.out.println(as.getFIO()+" добавлен водитель");
    }
    public void allDriver(){
        Iterator<Driver>iter=driver.iterator();
        System.out.println("Список водителей: ");
        while (iter.hasNext()){
            Driver next = iter.next();
            System.out.println(next.getFIO());
        }
    }

//    public void queue(){
//        for (int i=0;i<serviceStation.size(); i++){
//            System.out.println(serviceStation.get(i)+" в очереди.");
//        }
//    }
//
//    public void autoQueue(Transport car){
//        serviceStation.add(car);
//        System.out.println(car.getBrand()+ " добавить ТС в очередь");
//    }
//    public void technicalInspection(){
//        System.out.println("Провести техосмотр авто");
//    }
//    public void passed (){
//        serviceStation.remove(0);
//        System.out.println("ТС прошело ТО");
//    }
}
