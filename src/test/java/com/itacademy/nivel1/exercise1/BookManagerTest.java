package com.itacademy.nivel1.exercise1;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class BookManagerTest {

    @Test
    public void constructor_shouldInitializeCollection() {
        BookManager bookManager = new BookManager(null);
        assertNotNull(bookManager.getBooks());
    }

    @Test
    public void addBooks_shouldAddAllBooksToCollection (){
        List<Book> initialBooks = getInitialBooks();

        BookManager bookManager = new BookManager(initialBooks);

        List<Book> newBooks = new ArrayList<>();
        newBooks.add(new Book("Book 4", "Author 3"));
        newBooks.add(new Book("Book 5", "Author 4"));

        bookManager.addBooks(newBooks);

        assertEquals(5, bookManager.getBooks().size());
    }

    @Test
    public void addBook_shouldBeInTheExpectedPosition () {
        List<Book> initialBooks = getInitialBooks();

        BookManager bookManager = new BookManager(initialBooks);

        bookManager.addBook(1,(new Book("Other book", "Other author")));

        assertEquals("Other book", bookManager.getBooks().get(1).getTitle());
    }

    @Test
    public void getTitleByIndex_shouldReturnTitleAtSpecifiedPosition() {
        List<Book> initialBooks = getInitialBooks();

        BookManager bookManager = new BookManager(initialBooks);

        assertEquals("Book 2", bookManager.getTitleByIndex(1));
    }

    @Test
    public void addBook_shouldInsertBookAtSpecifiedPosition () {
        List<Book> initialBooks = getInitialBooks();

        BookManager bookManager = new BookManager(initialBooks);

        bookManager.addBook(1,(new Book("Other book", "Other author")));

        List<Book> resultingBooks = bookManager.getBooks();

        assertEquals(4, resultingBooks.size());
        assertEquals("Other book", resultingBooks.get(1).getTitle());
    }

    @Test
    public void constructor_shouldThrowExceptionWithDuplicateTitles () {
        List<Book> initialBooks = new ArrayList<>();
        initialBooks.add(new Book("Book 1", "Author 1"));
        initialBooks.add(new Book("Book 1", "Author 2"));

        assertThrows(IllegalArgumentException.class, () -> new BookManager(initialBooks));
    }

    @Test
    public void addBook_shouldThrowExceptionWhenTitleAlreadyExists() {
        List<Book> initialBooks = new ArrayList<>();
        initialBooks.add(new Book("Book 1", "Author 1"));
        initialBooks.add(new Book("Book 2", "Author 2"));

        BookManager bookManager = new BookManager(initialBooks);

        assertThrows(IllegalArgumentException.class, () -> bookManager.addBook(1,(new Book("Book 1", "Other author"))));
    }

    @Test
    public void addBooks_shouldThrowExceptionWhenTitleAlreadyExists() {
        List<Book> initialBooks = getInitialBooks();

        BookManager bookManager = new BookManager(initialBooks);

        List<Book> newBooks = new ArrayList<>();
        newBooks.add(new Book("Book 3", "Author 3"));
        newBooks.add(new Book("Book 2", "Author 4"));

        assertThrows(IllegalArgumentException.class, () -> bookManager.addBooks(newBooks));
    }

    @Test
    public void deleteBookByTitle_shouldReduceSizeCollection () {
        List<Book> initialBooks = getInitialBooks();

        BookManager bookManager = new BookManager(initialBooks);

        bookManager.deleteBookByTitle("Book 3");

        assertEquals(2,bookManager.getBooks().size());
    }

    @Test
    public void getSortedBooksAsc_returnsBooksAlphabeticallyWithoutModifyingOriginal() {
        List<Book> initialBooks = new ArrayList<>();
        initialBooks.add(new Book("Crime and Punishment", "Fiódor Dostoyevsky"));
        initialBooks.add(new Book("Angels & Demons", "Dan Brown"));
        initialBooks.add(new Book("Brave New World", "Aldous Huxley"));

        BookManager bookManager = new BookManager(initialBooks);

        List<Book> sortedBooks = bookManager.getSortedBooksAsc();

        assertEquals("Angels & Demons", sortedBooks.get(0).getTitle());
        assertEquals("Brave New World", sortedBooks.get(1).getTitle());
        assertEquals("Crime and Punishment", sortedBooks.get(2).getTitle());
    }

    private static List<Book> getInitialBooks() {
        List<Book> initialBooks = new ArrayList<>();
        initialBooks.add(new Book("Book 1", "Author 1"));
        initialBooks.add(new Book("Book 2", "Author 2"));
        initialBooks.add(new Book("Book 3", "Author 3"));
        return initialBooks;
    }
}
