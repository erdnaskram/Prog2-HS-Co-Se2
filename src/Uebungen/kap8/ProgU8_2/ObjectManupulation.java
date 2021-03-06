package Uebungen.kap8.ProgU8_2;

import Uebungen.kap7.ProgU7_1.Bibliothek;
import Uebungen.kap7.ProgU7_1.Book;

import java.util.HashSet;
import java.util.Set;

public class ObjectManupulation {

    public static void main(String[] args) {
        Set<Book> buecherSammlung = new HashSet<>();
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

        buecherSammlung.stream().filter(book -> book.getAutor().contains("Meyer")).forEach(System.out::println);
    }
}
