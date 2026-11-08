package com.itacademy.nivel1.exercise1;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class BookManager {

    List<Book> books = new ArrayList<>();

    public BookManager(List<Book> books) {
        if(books != null && !books.isEmpty()) {
            addBooks(books);
        }
    }

    public void addBooks (List<Book> books) {
        for (Book book : books) {
            validateTitle(book.getTitle());
            this.books.add(new Book(book.getTitle(), book.getAuthor()));
        }
    }

    public List<Book> getBooks () {
        return List.copyOf(books);
    }

    public String getTitleByIndex (int index) {
        if (index < 0 || index > books.size() -1) {
            throw new IllegalArgumentException("Index out of bounds");
        }

        return books.get(index).getTitle();
    }

    public void addBook (int index, Book book) {
        if (index < 0 || index > books.size()) {
            throw new IllegalArgumentException("Index out of bounds");
        }
        validateTitle(book.getTitle());

        books.add(index, new Book(book.getTitle(), book.getAuthor()));
    }

    public boolean deleteBookByTitle (String title) {
        return books.removeIf(book -> book.getTitle().equalsIgnoreCase(title));
    }

    public List<Book> getSortedBooksAsc () {
        Comparator<Book> comparatorByTitle =
                (b1,b2)-> (b1.getTitle().compareToIgnoreCase(b2.getTitle()));

        List <Book> sortedBooks = new ArrayList<>(books);
        sortedBooks.sort(comparatorByTitle);

        return sortedBooks;
    }

    private void validateTitle (String title) {
        if(title == null || title.isBlank()) {
            throw new IllegalArgumentException("Error. Titles cannot be null or blank.");
        }

        for(Book book : books) {
            if (book.getTitle().strip().equalsIgnoreCase(title.strip())) {
                throw new IllegalArgumentException("Error. Duplicate titles are not allowed");
            }
        }
    }
}
