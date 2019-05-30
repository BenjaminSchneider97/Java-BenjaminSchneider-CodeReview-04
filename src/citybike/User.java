package citybike;

public class User {

    private int userID;
    private String name;
    private String surname;
    private Bike rentedBike;
    private Rent rentTime;

    private static int userIDCounter = 0;

    public User(String name, String surname){
        userIDCounter++;
        this.userID = userIDCounter;
        this.name = name;
        this.surname = surname;
    }

    public int getUserID() {
        return this.userID;
    }

    public void setUserID(int userID) {
        this.userID = userID;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return this.surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public Bike getRentedBike() {
        return this.rentedBike;
    }

    public void setRentedBike(Bike rentedBike) {
        this.rentedBike = rentedBike;
    }

    public Rent getRentTime() {
        return rentTime;
    }

    public void setRentTime(Rent rentTime) {
        this.rentTime = rentTime;
    }
}
