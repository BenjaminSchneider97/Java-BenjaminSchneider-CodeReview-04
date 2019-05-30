package citybike;

import java.time.LocalDateTime;

public class Rent{

    private Bike bikeRentID;
    private LocalDateTime rentStart;
    private LocalDateTime rentEnd;

    public Rent(Bike bikeRentID, LocalDateTime rentStart, LocalDateTime rentEnd){
        this.bikeRentID = bikeRentID;
        this.rentStart = rentStart;
        this.rentEnd = rentEnd;
    }

    public Bike getBikeRentID() {
        return bikeRentID;
    }

    public void setBikeRentID(Bike bikeRentID) {
        this.bikeRentID = bikeRentID;
    }

    public LocalDateTime getRentStart() {
        return rentStart;
    }

    public void setRentStart(LocalDateTime rentStart) {
        this.rentStart = rentStart;
    }

    public LocalDateTime getRentEnd() {
        return rentEnd;
    }

    public void setRentEnd(LocalDateTime rentEnd) {
        this.rentEnd = rentEnd;
    }
}
