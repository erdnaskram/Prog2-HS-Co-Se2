package Uebungen.kap7.ProgU7_1;

import java.util.*;
import java.util.stream.Collectors;

public class Bibliothek {

    private final Collection<Book> coll;

    public Bibliothek(Collection<Book> coll){
        this.coll = coll;
    }

    public boolean einfuegen(Book book) {
        if (book != null){
            coll.add(book);
            return true;
        } else {
            return false;
        }
    }

    public Collection<Book> sucheNachAutor(String autor){
        Collection<Book> authorsBooks = new LinkedList<Book>();
        for (Book book : coll) {
            if (book.getAutor().equals(autor)){
                authorsBooks.add(book);
            }
        }
        return authorsBooks;
    }

    public Book sucheNachISBN(String isbn){
        for (Book book : coll) {
            if (book.getISBN().equals(isbn)){
                return book;
            }
        }
        return null;
    }

    public Collection<Book> bestandSortierenNach(Comparator<Book> buch){
        Collection<Book> sortBooks = coll.stream().sorted(buch).collect(Collectors.toList());
        return sortBooks;
    }
//    public Collection<Book> bestandSortierenNach(Comparator<Book> buch){
//        Collection<Book> sortBooks = coll;
//        Collections.sort(sortBooks, buch);
//        return sortBooks;
//    }

//    public Map<String, List<Book>> bestandNachAutor() {
//        Map<String, List<Book>> authorMap = new HashMap<>();
//        for (Book book : coll) {
//            if (authorMap.containsKey(book.getAutor())){
//                authorMap.get(book.getAutor()).add(book);
//            } else {
//                List<Book> bookList = new ArrayList<>();
//                bookList.add(book);
//                authorMap.put(book.getAutor(), bookList);
//            }
//        }
//        return authorMap;
//    }
    public Map<String, List<Book>> bestandNachAutor() {
        Map<String, List<Book>> authorMap = new HashMap<>();
        for (Book book : coll) {
            if (!authorMap.containsKey(book.getAutor())){
                List<Book> bookList = new ArrayList<>();
                authorMap.put(book.getAutor(), bookList);
            }
            authorMap.get(book.getAutor()).add(book);
        }
        return authorMap;
    }

    @Override
    public String toString() {
        return coll.toString();
    }

}
