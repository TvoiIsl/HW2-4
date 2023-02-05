package Transport;

import java.util.*;

public class ServiceStation {
    Map<Transport,Mechanic>mechanics=new HashMap<>();
    Set<Driver>driver=new HashSet<>();
    public void addMechanic(Transport transport,Mechanic mechanic){
        if (!mechanics.containsKey(transport)&!mechanics.containsValue(mechanic)){
            mechanics.put(transport,mechanic);
            System.out.println("ТС "+transport.getBrand()+" имеет механика "+mechanic.getName()+" и относится к компании "+mechanic.getCompany());
        }else {
            System.out.println("Без повторов");
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
