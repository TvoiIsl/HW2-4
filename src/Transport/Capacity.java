package Transport;

public enum Capacity {ESPECIALLY_SMALL(null,10),
    SMALL(null,25),
    AVERAGE(40,50),
    BIG(60,80),
    EXTRA_LARGE(100,120),;

    private final Integer place1;
    private final Integer place2;

    Capacity(Integer place1, Integer place2) {
        this.place1 = place1;
        this.place2 = place2;
    }

    public double getPlace1() {
        return place1;
    }
    public double getPlace2() {
        return place2;
    }
    public String toString() {
        String x;
        if(place1 == null){
            x = "Вместимость: \"до "+ place2 +" человек.\"";
        }
        else if(place2 == null){
            x = "Вместимость: \"от "+ place1 +" человек.\"";
        }else {
            x = "Вместимость: \" от "+place1+" человек до "+place2+" человек";
        }

        return x;
    }
}
