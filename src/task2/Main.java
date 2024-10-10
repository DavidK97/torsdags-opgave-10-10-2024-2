package task2;

public class Main {
    //2. b
    public static void main (String [] args){
        //2. g
        Cafe coffeeMenu = new Cafe();   //Vi laver en ny instans af Cafe-klassen
        coffeeMenu.loadMenuData();      //Vi kalder vores metode for at indlæse fra coffees.txt
        System.out.println(coffeeMenu); //Vi printer coffees ud
    }
}
