package kap7.ProgU7_1;

import org.jetbrains.annotations.NotNull;

public class BookTitleComperator implements Comparable<Book>{

    public int compareTo(Book book1, Book book2) {
        return book1.title.compareTo(book2.title);
    }

    @Override
    public int compareTo(@NotNull Book o) {
        return 0;
    }
}
