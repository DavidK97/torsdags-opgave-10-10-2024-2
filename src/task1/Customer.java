package task1;

public class Customer {
    //1. a Laver Customer class med instansvariablerne:
    private String firstName;
    private String lastName;
    private String userName;
    private int id;
    private static int counter;

    //1. b Konstruktøren
    public Customer (String firstName, String lastname, String userName){
        this.firstName = firstName;
        this.lastName = lastname;
        this.userName = userName;

        //1. c
        counter++;
        id = counter;
    }


    //1. d
    public String getfirstName(){
        return firstName;
    }

    public String getLastName(){
        return lastName;
    }

    public String getUserName(){
        return userName;
    }

    public int getId(){
        return id;
    }

    public static int getCounter() {
        return counter;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String toString (){
        return firstName + " " + lastName + " | " + userName + " | " + "id nr: " + id;
    }

}
