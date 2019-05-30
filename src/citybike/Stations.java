package citybike;

import java.util.ArrayList;

public class Stations {

    private int stationID;
    private String location;
    private ArrayList<Bike> bikesInStation;

    private static int stationIDCounter = 0;

    public Stations(String location, ArrayList<Bike> bikesInStation){
        stationIDCounter++;
        this.stationID = stationIDCounter;
        this.location = location;
        this.bikesInStation = bikesInStation;
    }

    public int getStationID() {
        return this.stationID;
    }

    public void setStationID(int stationID) {
        this.stationID = stationID;
    }

    public String getLocation() {
        return this.location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public ArrayList<Bike> getBikesInStation() {
        return this.bikesInStation;
    }

    public void setBikesInStation(ArrayList<Bike> bikesInStation) {
        this.bikesInStation = bikesInStation;
    }

    public void addBike(Bike bike){
        if(bikesInStation.size() >= 5){
            System.out.println("Sorry, you can't add more than five bikes to one station!");
        } else{
            this.bikesInStation.add(bike);
        }
    }

    public void rentBike(User user, Bike bike){
        if(this.bikesInStation.contains(bike) && bike.getState().equals(Bike.State.CanBeRented) && user.getRentedBike() == null){
            this.bikesInStation.remove(bikesInStation.indexOf(bike));
            user.setRentedBike(bike);
            System.out.println("User " + user.getName() + " " + user.getSurname() + " successfully rented the bike " + bike.getBikeID() + " from the station in " + this.getLocation() + ".");
        } else if(user.getRentedBike() != null){
            System.out.println("User " + user.getName() + " " + user.getSurname() + " already rents a bike!");
        } else if (!this.bikesInStation.contains(bike)){
            System.out.println("Sorry, but the station in " + this.getLocation() + " does not have the bike " + bike.getBikeID() + ".");
        } else if(!bike.getState().equals(Bike.State.CanBeRented)){
            System.out.println("Sorry, but the bike in the station " + this.getLocation() + " can't be rented at the moment!");
        }
    }

    public void returnBike(User user, Bike bike){
        if(user.getRentedBike().equals(bike)){
            this.bikesInStation.add(bike.getBikeID()-1, bike);
            user.setRentedBike(null);
            System.out.println("User " + user.getName() + " " + user.getSurname() + " successfully returned bike " + bike.getBikeID() + " to the station in " + this.getLocation() + ".");
        } else {
            System.out.println(user.getName() + " " + user.getSurname() + " can't return the bike " + bike.getBikeID() + " because he didn't rent it before!");
        }
    }
}
