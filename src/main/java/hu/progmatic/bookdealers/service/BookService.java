package hu.progmatic.bookdealers.service;

import hu.progmatic.bookdealers.model.Book;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Service
public class BookService {
    private final List<Book> books = new ArrayList<>();

    private final Random randomGenerator;

    public BookService(Random random) {

        this.randomGenerator = random;

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



    public Book getRandomBook(){
        return books.get(randomGenerator.nextInt(books.size()));
    }
}
