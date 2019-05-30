package citybike;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class StationsTest {

    @org.junit.jupiter.api.BeforeEach
    void setUp() {
    }

    @org.junit.jupiter.api.AfterEach
    void tearDown() {
    }

    @org.junit.jupiter.api.Test
    void getStationID() {
    }

    @org.junit.jupiter.api.Test
    void setStationID() {
    }

    @org.junit.jupiter.api.Test
    void getLocation() {
    }

    @org.junit.jupiter.api.Test
    void setLocation() {
    }

    @org.junit.jupiter.api.Test
    void getBikesInStation() {
    }

    @org.junit.jupiter.api.Test
    void setBikesInStation() {
    }

    @org.junit.jupiter.api.Test
    void addBike() {
    }

    @org.junit.jupiter.api.Test
    void rentBike() {
        Bike b1 = new Bike("Black", Bike.State.CanBeRented);
        ArrayList<Bike> bikes1 = new ArrayList<>();
        Stations s1 = new Stations("Vienna", bikes1);
        s1.addBike(b1);
        User u1 = new User("John", "Doe");
        s1.rentBike(u1, b1);
        assertTrue(bikes1.isEmpty());
    }

    @org.junit.jupiter.api.Test
    void returnBike() {
        Bike b1 = new Bike("Black", Bike.State.CanBeRented);
        ArrayList<Bike> bikes1 = new ArrayList<>();
        Stations s1 = new Stations("Vienna", bikes1);
        s1.addBike(b1);
        User u1 = new User("John", "Doe");
        s1.rentBike(u1, b1);
        s1.returnBike(u1, b1);
        assertEquals(true, bikes1.indexOf(b1) == 0);
    }
}