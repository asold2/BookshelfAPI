package BookshelfAPI.BookshelfAPI.controllers;
import BookshelfAPI.BookshelfAPI.dtos.BookDto;
import BookshelfAPI.BookshelfAPI.models.Book;
import BookshelfAPI.BookshelfAPI.service.BookService;
import BookshelfAPI.BookshelfAPI.service.ShelfService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.*;
@RestController
public class BooksController {

    @Autowired
    private BookService bookService;
    @Autowired
    private ShelfService shelfService;

    @PostMapping("book")
    public ResponseEntity addBook(@RequestBody BookDto bookDto){

        bookService.addBook(bookDto);

        return new ResponseEntity(HttpStatus.OK);
    }

    @GetMapping("books")
    public ResponseEntity<List<Book>> getAllBooks(){

        List<Book> allBooks = bookService.getAllBooks();

        return ResponseEntity.status(HttpStatus.OK).body(allBooks);
    }

    @GetMapping("books/{id}")
    public ResponseEntity<Book> getBookById(@PathVariable int id){

        Book bookToReturn = bookService.getBookById(id);

        if (bookToReturn==null){
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(null);
        }

        return ResponseEntity.status(HttpStatus.OK).body(bookToReturn);
    }
}
