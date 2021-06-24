package Uebungen.kap7.ProgU7_1;

import java.util.HashSet;
import java.util.Set;

public class Testklasse2 {

    public static void main(String[] args) {

        Set<Book> buecherSammlung = new HashSet<>();
        Bibliothek bibliothek = new Bibliothek(buecherSammlung);

        bibliothek.einfügen(new Book("Reinhard Schiedermeier","Java Praktikum", "9784898645133"));
        bibliothek.einfügen(new Book("Harvey Deitel","How to program Java", "01303451517"));
        bibliothek.einfügen(new Book("Bertrand Meyer","Object Oriented Software Construction", "0136290310"));
        bibliothek.einfügen(new Book("Bertrand Meyer","Software Engineering Approaches for Offshore and Outsourced Development", "9783642018558"));
        bibliothek.einfügen(new Book("Kathy Sierra","Java von Kopf bis Fuss", "9783897214484"));
        bibliothek.einfügen(new Book("Reinhard Schiedermeier","Java Praktikum", "9784898645133"));
        bibliothek.einfügen(new Book("Harvey Deitel","How to program Java", "01303451517"));
        bibliothek.einfügen(new Book("Bertrand Meyer","Object Oriented Software Construction", "0136290310"));
        bibliothek.einfügen(new Book("Bertrand Meyer","Software Engineering Approaches for Offshore and Outsourced Development", "9783642018558"));
        bibliothek.einfügen(new Book("Kathy Sierra","Java von Kopf bis Fuss", "9783897214484"));
        bibliothek.einfügen(new Book("Mark Utting","Pratical Model based Testing", "9780123725011"));

        System.out.println(bibliothek);
        System.out.println("Test---------------------------------------------------------------------");

        System.out.println(bibliothek.bestandNachAutor());


    }
}
