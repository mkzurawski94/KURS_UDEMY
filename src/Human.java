public class Human {
    int shoeNumber;
    String firstName;
    String lastName;
    int phoneNumber;

    Human()
    {
        System.out.println("konstruktor domyslny");
    }
    Human(int shoeNumber, String firstName, String lastName, int phoneNumber)
    {
        this.shoeNumber = shoeNumber;
        this.phoneNumber = phoneNumber;
        this.lastName = lastName;
        this.firstName = firstName;
    }

    void wypisz ()
    {
        System.out.print(shoeNumber);
        System.out.print(firstName);
        System.out.print(lastName);
        System.out.print(phoneNumber);
        System.out.println();

    }
     void dodajNumerButa()
    {
        shoeNumber+=1;
    }
}
