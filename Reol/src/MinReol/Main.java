package MinReol;

//Dette er min main class, der sammenfatter informationerne fra min Reol.java-fil og Farver.java-fil.
public class Main {

    public static void main(String[] args) {
        //Her forbinder jeg de oplyste antal film via en int-variabel
        Reol shelf1 = new Reol();
        System.out.println("Så mange film er der i min reol: " + shelf1.AntalFilm);

        //Her forbinder jeg de oplyse antal film via en int-variabel
        Reol shelf2 = new Reol();
        System.out.println("Så mange bøger er der i min reol: " + shelf1.AntalBoeger);

        //Her ændrer jeg min variabel i AntalBoeger, da jeg fandt ud af, at der var en fejl i min Reol.java.
        Reol shelf3 = new Reol();
        shelf3.AntalBoeger = 15;
        System.out.println("Hov, der var faktisk kun " + shelf3.AntalBoeger + " - My bad, sorry.");

        //Her skal jeg bruge noget hjælp til en forklaring!!!
        Farver farve1 = new Farver();
        farve1.farver = "Reolen er brun!";
        System.out.println(farve1.farver);

    }
}
