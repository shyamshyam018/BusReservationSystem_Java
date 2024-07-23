package src.BusRev;

public class Bus {
    private int BusNum;
    private boolean Ac;
    private int Capacity;

    Bus(int bn , boolean ac , int cap){
        this.BusNum = bn;
        this.Ac = ac;
        this.Capacity = cap;
    }

    //Creating getter and setter functions

    //getters
    public int FindBusNo(){  
        return BusNum;
    }
    public boolean FindAC(){
        return Ac;
    }
    public int FindCapacity(){
        return Capacity;
    }
    public void showBuses(){
        System.out.println("BusNum : "+BusNum+", Ac Available? : " +Ac+", Capacity : "+Capacity);
    }

    //setters
    public void SetCapacity(int cap){ 
        Capacity = cap;
    }
}

