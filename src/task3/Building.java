package task3;

import java.util.ArrayList;

public class Building {
    //3. d instansvariabler
    private ArrayList <Room> rooms;
    private int numberOfFloors;

    //3. e Konstruktør

    public Building(ArrayList<Room> rooms, int numberOfFloors) {
        this.rooms = rooms;
        this.numberOfFloors = numberOfFloors;
    }

    //3. f getter og setter metoder
    public int getNumberOfFloors() {
        return numberOfFloors;
    }

    public void setNumberOfFloors(int numberOfFloors) {
        this.numberOfFloors = numberOfFloors;
    }

    public ArrayList<Room> getRooms() {
        return rooms;
    }

    public void setRooms(ArrayList<Room> rooms) {
        this.rooms = rooms;
    }
}
