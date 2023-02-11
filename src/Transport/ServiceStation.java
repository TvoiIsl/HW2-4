package Transport;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class ServiceStation {
    private Queue serviceStation = new LinkedList();


    public void autoQueue(Transport transport){
        boolean check = transport instanceof Bus;
        if( !check ){
            serviceStation.add(transport);
            System.out.println(transport.getBrand()+ " добавить ТС в очередь!");
        }else {
            System.out.println("Автобусам нельзя в сервис!");
        }

    }
    public void technicalInspection(){
        System.out.println("Провести техосмотр авто");
    }
    public void passed (){

//        serviceStation.poll();
        if (serviceStation.poll()!=null){
            System.out.println("Машина продиагностирована");
            System.out.println("ТС ждет ТО " + serviceStation.size());
        }
    }
}
