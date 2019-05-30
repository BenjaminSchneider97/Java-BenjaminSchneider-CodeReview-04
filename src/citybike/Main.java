package citybike;

import java.util.ArrayList;
import java.util.HashMap;

public class Main {

    public static void main(String[] args) {

        //create 8 bike objects
        Bike b1 = new Bike("Black", Bike.State.CanBeRented);
        Bike b2 = new Bike("Green", Bike.State.CanBeRented);
        Bike b3 = new Bike("Blue", Bike.State.CanBeRented);
        Bike b4 = new Bike("Black", Bike.State.CanBeRented);
        Bike b5 = new Bike("Yellow", Bike.State.CanBeRented);
        Bike b6 = new Bike("Red", Bike.State.InService);
        Bike b7 = new Bike("Orange", Bike.State.CanBeRented);
        Bike b8 = new Bike("Red", Bike.State.Discarded);

        //create hashmap for all bikes
        HashMap<Integer, Bike.State> allBikes = new HashMap<>();

        allBikes.put(b1.getBikeID(), b1.getState());
        allBikes.put(b2.getBikeID(), b2.getState());
        allBikes.put(b3.getBikeID(), b3.getState());
        allBikes.put(b4.getBikeID(), b4.getState());
        allBikes.put(b5.getBikeID(), b5.getState());
        allBikes.put(b6.getBikeID(), b6.getState());
        allBikes.put(b7.getBikeID(), b7.getState());
        allBikes.put(b8.getBikeID(), b8.getState());

        //create three arraylists that hold the bikes one store currently has
        ArrayList<Bike> bikes1 = new ArrayList<>();
        ArrayList<Bike> bikes2 = new ArrayList<>();
        ArrayList<Bike> bikes3 = new ArrayList<>();

        //create three station objects
        Stations s1 = new Stations("Vienna", bikes1);
        Stations s2 = new Stations("Berlin", bikes2);
        Stations s3 = new Stations("Paris", bikes3);

        //create hashmap for all stations
        HashMap<Integer, ArrayList<Bike>> allStations = new HashMap<>();

        allStations.put(s1.getStationID(), s1.getBikesInStation());
        allStations.put(s2.getStationID(), s2.getBikesInStation());
        allStations.put(s3.getStationID(), s3.getBikesInStation());

        //add three bikes to the store s1
        s1.addBike(b1);
        s1.addBike(b2);
        s1.addBike(b3);

        //add four bikes to store s2
        s2.addBike(b4);
        s2.addBike(b5);
        s2.addBike(b6);
        s2.addBike(b7);

        //check if you are able to add more than 5 bikes to one store
        //s1.addBike(b4);
        //s1.addBike(b5);
        //s1.addBike(b6);                                           // Gives you the message that you can't add more than five bikes

        //create 4 user objects
        User u1 = new User("John", "Doe");
        User u2 = new User("Jane", "Doe");
        User u3 = new User("James", "Doe");
        User u4 = new User("Jake", "Doe");

        //Demonstrates the renting process also showing the bikes that a currently in the store before and after a user rented a bike
        System.out.println(allStations.get(s1.getStationID()));     // shows bikes in the store
        System.out.println(u1.getRentedBike());                     // check bikes the user currently rents
        s1.rentBike(u1, b1);                                        // user u1 rents bike b1
        System.out.println(allStations.get(s1.getStationID()));     // shows bikes in the store
        System.out.println(u1.getRentedBike());                     // checks bikes the user currently rents
        s1.returnBike(u1, b1);                                      // user u1 returns bike b1
        System.out.println(allStations.get(s1.getStationID()));     // shows bikes in the store
        System.out.println(u1.getRentedBike());                     // checks bikes the user currently rents
    }
}
