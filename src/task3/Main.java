package task3;
import java.util.ArrayList;

public class Main {
    public static void main(String [] args){
        //3. g Opretter nye Room objekter
        Room room1 = new Room(2, 4);
        Room room2 = new Room(1, 2);
        Room room3 = new Room(5,0);


        //3. h Tilføjer Room objekterne til et Room ArrayList
        ArrayList <Room> rooms = new ArrayList<>();
        rooms.add(room1);
        rooms.add(room2);
        rooms.add(room3);

        //3. i Vi laver et Building objekt og giver det vores rooms ArrayList som argument
        Building building1 = new Building(rooms, 2);
        Building building2 = new Building(rooms, 5);

        //Vi kalder på vores metoder
        System.out.println("Lamps in total: " + countLampsInBuilding(building1));
        System.out.println("Windows in total: " + countWindowsInBuilding(building1));
        System.out.println("Rooms in total: " + countRoomsInBuilding(building1));

        //Vi tester om bygningerne er normale
        System.out.println("building1:");
        isNormal(building1);

        System.out.println("building2:");
        isNormal(building2);



    }

    //3. j
    public static int countLampsInBuilding (Building building) {  //Metoden tager et Building objekt som parameter
        int totalNumberOfLamps = 0;                              //Variablen holder antallet af lamper i bygningen
        for (Room room : building.getRooms()) {      //For-each loop der gennemløber objektet: building1's rooms ArrayList
            totalNumberOfLamps = totalNumberOfLamps + room.getNumberOfLamps(); //For hver iteration af et Room objekt ligges antallet af lamper i et Room objekt til variablen
        }
        return totalNumberOfLamps;
    }

    public static int countWindowsInBuilding(Building building) {
        int totalNumberOfWindows = 0;
        for (Room room : building.getRooms()) {
            totalNumberOfWindows = totalNumberOfWindows + room.getNumberOfWindows();
        }
        return totalNumberOfWindows;
    }


    //Metode til at tælle antallet af Room objekter i et Building objekt
    public static int countRoomsInBuilding(Building building) {
        return building.getRooms().size();   //Vi returnere antallet af Room objekter i Building objektets rooms ArrayList
    }

    //3.k Vi kalder på 2 af vores andre metoder for at finde ud af hvor mange floors og rooms der er i en bygning
    public static boolean isNormal(Building building) {
        if (building.getNumberOfFloors() >= countRoomsInBuilding(building)) {
            System.out.println("The number of floors in the building: " + building.getNumberOfFloors() +
                    ", is greater than or equal to the number of rooms: " + countRoomsInBuilding(building));
            return true;
        }else{
            System.out.println("The number of floors in the building: " + building.getNumberOfFloors() +
                    ", is less than the number of rooms: " + countRoomsInBuilding(building));
            return false;
        }
    }
}
