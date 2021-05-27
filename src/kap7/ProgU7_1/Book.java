package kap7.ProgU7_1;

public class Book implements Comparable<Book> {
    protected final String autor;
    protected final String isbn;
    protected final String title;

    public Book(String autor, String isbn, String title) {
        this.autor = autor;
        this.isbn = isbn;
        this.title = title;
    }

    public String getAutor() {
        return autor;
    }

    public String getISBN() {
        return isbn;
    }

    public String getTitle() {
        return title;
    }

    @Override
    public boolean equals(Object anotherBook) {
        if (this == anotherBook) {
            return true;
        }
        if (anotherBook == null) {
            return false;
        }
        if (this.getClass() != anotherBook.getClass()) {
            return false;
        }
        Book temp = (Book) anotherBook;
        if (!this.autor.equalsIgnoreCase(temp.autor) || !this.isbn.equalsIgnoreCase(temp.isbn)
                || !this.title.equalsIgnoreCase(temp.title)) {
            return false;
        }

        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((autor == null) ? 0 : autor.hashCode());
        result = prime * result + ((isbn == null) ? 0 : isbn.hashCode());
        result = prime * result + ((title == null) ? 0 : title.hashCode());
        return result;
    }

    @Override
    public int compareTo(Book anotherBook) {
        return this.isbn.compareToIgnoreCase(anotherBook.getISBN());
    }

    @Override
    public String toString() {
        return this.title + ", " + this.isbn;
    }
}