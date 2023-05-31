package com.kodilla.patterns2.adapter.bookclassifier;

import com.kodilla.patterns2.adapter.bookclassifier.librarya.Book;
import com.kodilla.patterns2.adapter.bookclassifier.librarya.Classifier;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class MedianAdapter extends MedianAdaptee implements Classifier {
    @Override
    public int publicationYearMedian(Set<Book> bookSet) {
        List<Integer> publicationYears = new ArrayList<>();
        for (Book book : bookSet) {
            publicationYears.add(book.getPublicationYear());
        }

        publicationYears.sort(null);

        int middleIndex = publicationYears.size() / 2;
        if (publicationYears.size() % 2 == 0) {
            return (publicationYears.get(middleIndex - 1) + publicationYears.get(middleIndex)) / 2;
        } else {
            return publicationYears.get(middleIndex);
        }
    }
}
