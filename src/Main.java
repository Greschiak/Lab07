import zadanie1.Samolot;
import zadanie1.Statek;
import zadanie2.Wieloryb;
import zadanie3.*;

import java.util.ArrayList;
import java.util.List;


public class Main {
    public static void main(String[] args) {

        Statek statek1 = new Statek();
        Samolot samolot1 = new Samolot();
        samolot1.lec();
        statek1.plyn();
        Wieloryb wieloryb1 = new Wieloryb();
        wieloryb1.plyn();
        wieloryb1.wynurz();
        wieloryb1.zanurz();
        Kwadrat kwadrat1 = new Kwadrat(2,"Czerwony");
        Prostokat prostokat1 = new Prostokat(2,3,"Zielony");
        Trojkat trojkat1= new Trojkat(3,2,"Niebieski");
        Punkt punkt1 = new Punkt(2,4);
        System.out.println(kwadrat1.opis());
        System.out.println(prostokat1.opis());
        System.out.println(trojkat1.opis());
        Figura[] tablicaFigur = new Figura[10];
        tablicaFigur[0] = new Prostokat(3, 5, "Czerwony");
        tablicaFigur[1] = new Trojkat(4, 6, "Zielony");
        tablicaFigur[2] = new Kwadrat(2, "Niebieski");
        tablicaFigur[3] = new Trojkat(5, 8, "Pomarańczowy");
        tablicaFigur[4] = new Prostokat(2, 7, "Żółty");
        tablicaFigur[5] = new Kwadrat(4, "Fioletowy");
        tablicaFigur[6] = new Trojkat(3, 9, "Czarny");
        tablicaFigur[7] = new Prostokat(4, 6, "Granatowy");
        tablicaFigur[8] = new Kwadrat(5, "Biały");
        tablicaFigur[9] = new Prostokat(1, 2, "Różowy");
        for (int i = 0; i < 10; i++) {
            System.out.println(tablicaFigur[i].opis());
        }
        List<IFigury> listaFigur = new ArrayList<>();
        Prostokat PROSTOKAT = new Prostokat(5, 10, "czerwony");
        Kwadrat KWADRAT = new Kwadrat(7, "niebieski");
        Trojkat TROJKAT = new Trojkat(4, 6, "zielony");
        listaFigur.add(PROSTOKAT);
        listaFigur.add(KWADRAT);
        listaFigur.add(TROJKAT);
        for(IFigury figura : listaFigur) {
            System.out.println("Powierzchnia figury: " + figura.getPowierzchnia());
            if(figura.wPolu(new Punkt(1, 1))) {
                System.out.println("Punkt (1,1) znajduje się w polu figury");
            }
            else {
                System.out.println("Punkt (1,1) nie znajduje się w polu figury");
            }
        }
        Okrag okrag1 = new Okrag("czerwony",6);
        System.out.println(okrag1.opis());
        System.out.println(okrag1.getPowierzchnia());
        System.out.println(okrag1.wPolu(new Punkt(1,2)));
        okrag1.przesun(1000,2220);
        System.out.println(okrag1.wPolu(new Punkt(1,2)));








    }
}