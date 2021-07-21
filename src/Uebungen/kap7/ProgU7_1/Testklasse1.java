package Uebungen.kap7.ProgU7_1;

import java.util.ArrayList;

public class Testklasse1 {

    public static void main(String[] args) {

        ArrayList<Book> buecherSammlung = new ArrayList<>();
        Bibliothek bibliothek = new Bibliothek(buecherSammlung);

        bibliothek.einfuegen(new Book("Reinhard Schiedermeier","Java Praktikum", "9784898645133"));
        bibliothek.einfuegen(new Book("Harvey Deitel","How to program Java", "01303451517"));
        bibliothek.einfuegen(new Book("Bertrand Meyer","Object Oriented Software Construction", "0136290310"));
        bibliothek.einfuegen(new Book("Bertrand Meyer","Software Engineering Approaches for Offshore and Outsourced Development", "9783642018558"));
        bibliothek.einfuegen(new Book("Kathy Sierra","Java von Kopf bis Fuss", "9783897214484"));
        bibliothek.einfuegen(new Book("Reinhard Schiedermeier","Java Praktikum", "9784898645133"));
        bibliothek.einfuegen(new Book("Harvey Deitel","How to program Java", "01303451517"));
        bibliothek.einfuegen(new Book("Bertrand Meyer","Object Oriented Software Construction", "0136290310"));
        bibliothek.einfuegen(new Book("Bertrand Meyer","Software Engineering Approaches for Offshore and Outsourced Development", "9783642018558"));
        bibliothek.einfuegen(new Book("Kathy Sierra","Java von Kopf bis Fuss", "9783897214484"));
        bibliothek.einfuegen(new Book("Mark Utting","Pratical Model based Testing", "9780123725011"));

        System.out.println(bibliothek);
        System.out.println("Test---------------------------------------------------------------------");

        System.out.println(bibliothek.bestandNachAutor());


    }
}
