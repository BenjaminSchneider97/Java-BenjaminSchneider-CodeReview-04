package citybike;

import java.util.GregorianCalendar;

public class Rent{

    private Bike bikeID;
    private GregorianCalendar rentStart;
    private GregorianCalendar rentEnd;

    public Rent(Bike bikeID, GregorianCalendar rentStart, GregorianCalendar rentEnd){
        this.bikeID = bikeID;
        this.rentStart = rentStart;
        this.rentEnd = rentEnd;
    }
}
