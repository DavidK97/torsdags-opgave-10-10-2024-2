package task3;


public class Room {
    //3. a instansvariabler
    private int numberOfLamps;
    private int numberOfWindows;

    //3. b Konstruktør
    public Room(int numberOfLamps, int numberOfWindows){
        this.numberOfLamps = numberOfLamps;
        this.numberOfWindows = numberOfWindows;
    }

    //3. c Vi opretter getter og setter metoder
    public int getNumberOfLamps(){
        return numberOfLamps;
    }

    public int getNumberOfWindows(){
        return numberOfWindows;
    }

    public void setNumberOfLamps(int numberOfLamps){
        this.numberOfLamps = numberOfLamps;
    }

    public void setNumberOfWindows(int numberOfWindows){
        this.numberOfWindows = numberOfWindows;
    }


}
