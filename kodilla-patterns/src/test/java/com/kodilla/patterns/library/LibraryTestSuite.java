package com.kodilla.patterns.library;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class LibraryTestSuite {

    @Test
    public void testGetBooks(){

        //Given
        Library library = new Library("Library 1");
        Book book1 = new Book("Książka1", "Jan", LocalDate.of(1996,10,10));
        Book book2 = new Book("Książka2", "Marek", LocalDate.of(2000,9,30));
        Book book3 = new Book("Książka3", "Wojciech", LocalDate.of(2017,3,7));
        Book book4 = new Book("Książka4", "Adam", LocalDate.of(1975,7,27));
        Book book5 = new Book("Książka5", "Henryk", LocalDate.of(1989,5,12));

        library.getBooks().add(book1);
        library.getBooks().add(book2);
        library.getBooks().add(book3);
        library.getBooks().add(book4);
        library.getBooks().add(book5);

        Library clonedLibrary=null;
        try {
            clonedLibrary= library.shallowCopy();
            clonedLibrary.setName("Shallow cloned Library 2");
        } catch (CloneNotSupportedException e){
            System.out.println(e);
        }

        Library deepClonedLibrary = null;
        try {
            deepClonedLibrary= library.deepCopy();
            deepClonedLibrary.setName("Deep cloned Library");
        } catch (CloneNotSupportedException e){
            System.out.println(e);
        }

        //When
        library.getBooks().remove(book2);

        //Then
        assertEquals(4, library.getBooks().size());
        assertEquals(4, clonedLibrary.getBooks().size());
        assertEquals(5, deepClonedLibrary.getBooks().size());
        assertEquals(library.getBooks(), clonedLibrary.getBooks());
        assertNotEquals(deepClonedLibrary.getBooks(), library.getBooks());

    }
}
