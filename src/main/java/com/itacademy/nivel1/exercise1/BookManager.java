package com.itacademy.nivel1.exercise1;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class BookManager {

    List<Book> books = new ArrayList<>();

    public BookManager(List<Book> books) {
        for (Book book : books) {
            this.books.add(new Book(book.getTitle(), book.getAuthor()));
        }
    }

    public void addbooks (List<Book> books) {
        for (Book book : books) {
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

        String title = books.get(index).getTitle();

        return title;
    }

    public void addBook (int index, Book book) {
        if (index < 0 || index > books.size()) {
            throw new IllegalArgumentException("Index out of bounds");
        }

        books.add(index, new Book(book.getTitle(), book.getAuthor()));
    }

    public boolean deleteBook (String title) {
        return books.removeIf(book -> book.getTitle().equalsIgnoreCase(title));
    }

    public List<Book> getSortedBooks () {
        Comparator<Book> comparatorByTitle = (b1,b2)-> (b1.getTitle().compareToIgnoreCase(b2.getTitle()));
        List <Book> sortedBooks = new ArrayList<>(books);
        sortedBooks.sort(comparatorByTitle);

        return sortedBooks;
    }


}
