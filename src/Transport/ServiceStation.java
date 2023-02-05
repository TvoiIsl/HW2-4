package Transport;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ServiceStation {
    Map<Transport,Mechanic>mechanics=new HashMap<>();
    public void addMechanic(Transport transport,Mechanic mechanic){
        if (!mechanics.containsKey(transport)&!mechanics.containsValue(mechanic)){
            mechanics.put(transport,mechanic);
            System.out.println("ТС "+transport.getBrand()+" имеет механика "+mechanic.getName()+" и относится к компании "+mechanic.getCompany());
        }else {
            System.out.println("Без повторов");
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
