package task2;

import java.io.FileNotFoundException;
import java.util.Scanner;
import java.io.File;
import java.util.ArrayList;

public class Cafe {
    //2. c
    private ArrayList <String> coffeeMenu = new ArrayList <> ();


    //2. c
    public ArrayList <String> getCoffeeMenu(){
        return coffeeMenu;
    }

    //2. d
    public void loadMenuData(){
        File file = new File("coffees.txt"); //Vi laver et File objekt der repræsenterer tekstfilen
        try {                                         //Da vi kan forvente en "FileNotFoundException", så laver vi en try/catch block
            Scanner fileReader = new Scanner (file);  //Vi laver en Scanner der skal læse vores fil
            while (fileReader.hasNextLine()){         //While-loop der kører så længe der er en ny linje i filen
                coffeeMenu.add(fileReader.nextLine()); //Vi tilføjer indholdet af hver linje i filen til vores ArrayList
            }

        }
        catch (FileNotFoundException e){
            System.out.println("File not found");
        }
    }

    //2. h Override af default toString så vi får tekststrengene istedet for hukommelsesplaceringen
    public String toString (){
        return coffeeMenu.toString();
    }


}
