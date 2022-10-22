package BookshelfAPI.BookshelfAPI.service;
import BookshelfAPI.BookshelfAPI.dtos.BookDto;
import BookshelfAPI.BookshelfAPI.models.Book;
import org.springframework.stereotype.Component;
import java.util.List;

@Component
public interface BookService {
    void addBook(BookDto bookDto);
    List<Book> getAllBooks();
    Book getBookById(int bookId);
}
