package citybike;

public class Bike {

    private int bikeID;
    private String color;
    public enum State {
        CanBeRented, CanNotBeRented, InService, Discarded
    }
    private State status;

    private static int bikeIDCounter = 0;

    public Bike(String color, State status){
        bikeIDCounter++;
        this.bikeID = bikeIDCounter;
        this.color = color;
        this.status = status;
    }

    public int getBikeID() {
        return this.bikeID;
    }

    public void setBikeID(int bikeID) {
        this.bikeID = bikeID;
    }

    public String getColor() {
        return this.color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Bike.State getState() {
        return this.status;
    }

    public void setState(Bike.State status) {
        this.status = status;
    }

    public String toString(){
        return "Bike: " + this.getBikeID() + ", Color: " + this.getColor() + ", Status: " + this.getState();
    }
}
