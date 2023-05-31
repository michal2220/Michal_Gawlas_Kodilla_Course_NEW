package com.kodilla.patterns2.adapter.bookclassifier;

import com.kodilla.patterns2.adapter.bookclassifier.librarya.Book;
import org.junit.jupiter.api.Test;

import java.util.HashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MedianAdapterTest {

    @Test
    public void publicationYearMedianTest() {
        //Given
        MedianAdapter medianAdapter = new MedianAdapter();

        Book book1 = new Book("Jan Kowlalski", "Tytuł", 1970, "1");
        Book book2 = new Book("Krzystof Nowak", "Też tytuł", 1990, "2");
        Book book3 = new Book("Andrzej Gurby", "Jeszcze inny tytuł", 2020, "3");

        Set<Book> bookSet = new HashSet<>();
        bookSet.add(book1);
        bookSet.add(book2);
        bookSet.add(book3);

        //When
        int medianYear = medianAdapter.publicationYearMedian(bookSet);

        //Then
        assertEquals(1990, medianYear);
    }
}