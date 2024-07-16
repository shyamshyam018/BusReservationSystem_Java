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

    //setters
    public void SetCapacity(int cap){ 
        Capacity = cap;
    }
}

