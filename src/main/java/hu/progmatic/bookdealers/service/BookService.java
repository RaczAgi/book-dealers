package hu.progmatic.bookdealers.service;

import hu.progmatic.bookdealers.model.Book;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class BookService {
    List<Book> books = new ArrayList<>();

    public BookService() {
        books.add(new Book("J. R. R. Tolkien", "The Lord of The Rings"));
        books.add(new Book("Milne", "The little princess"));
        books.add(new Book("Rowling", "Harry Potter"));
    }

    public void addBook(Book book){
        books.add(book);
    }

    public List<Book> getAllBooks() {
        return books;
    }

    public void setBooks(List<Book> books) {
        this.books = books;
    }
}
