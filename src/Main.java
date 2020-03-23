public class Main {


    public static void main (String [] args) {

//        Human Arek = new Human();
//        Arek.firstName = "Arek";
//        Arek.lastName = "Nowak";
//        Arek.phoneNumber = 512;
//        Arek.shoeNumber = 11;
        Human h1= new Human(12,"Antek", "Nowak",502);
        Human h2 = new Human(10, "Grazyna", "Nowak", 4);
        Human h3 = new Human (12,"Jola","Berek",15);

        h1.wypisz();
        h2.wypisz();
        h2.dodajNumerButa();
        h2.wypisz();
        h3.wypisz();









    }
}
