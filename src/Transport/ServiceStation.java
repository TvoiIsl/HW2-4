package Transport;

import java.util.ArrayList;
import java.util.List;

public class ServiceStation {
    List<Transport> serviceStation = new ArrayList<>();
    public void queue(){
        for (int i=0;i<serviceStation.size(); i++){
            System.out.println(serviceStation.get(i)+" в очереди.");
        }
    }

    public void autoQueue(Transport car){
        serviceStation.add(car);
        System.out.println(car.getBrand()+ " добавить ТС в очередь");
    }
    public void technicalInspection(){
        System.out.println("Провести техосмотр авто");
    }
    public void passed (){
        serviceStation.remove(0);
        System.out.println("ТС прошело ТО");
    }
}
