package BookshelfAPI.BookshelfAPI.service;
import BookshelfAPI.BookshelfAPI.dtos.BookDto;
import BookshelfAPI.BookshelfAPI.models.Book;
import BookshelfAPI.BookshelfAPI.models.Shelf;
import BookshelfAPI.BookshelfAPI.repositories.BookRepository;
import BookshelfAPI.BookshelfAPI.repositories.ShelfRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class BookServiceImpl implements BookService{

    @Autowired
    private BookRepository bookRepository;
    @Autowired
    private ShelfRepository shelfRepository;

    @Override
    public void addBook(BookDto bookDto) {
        Book book = null;
        if(bookDto.getShelfId()!=0){
            Shelf shelfForBook = null;
            boolean shelfExists = shelfRepository.findById(bookDto.getShelfId()).isPresent();

            System.out.println(shelfExists + "aaa");

            if(shelfExists){
                shelfForBook = shelfRepository.findById(bookDto.getShelfId()).get();
                System.out.println(shelfForBook + "bbb");
                book = new Book(bookDto.getTitle(), bookDto.getDescription(), bookDto.getNumberOfPages(), bookDto.getYearPublished(), shelfForBook);
            }
        }else{
            book = new Book(bookDto.getTitle(), bookDto.getDescription(), bookDto.getNumberOfPages(), bookDto.getYearPublished());
        }
        bookRepository.save(book);


    }

    @Override
    public List<Book> getAllBooks() {
        return bookRepository.findAll();
    }

    @Override
    public Book getBookById(int bookId) {
        if(bookRepository.existsById(bookId)){
            return bookRepository.findById(bookId).get();
        }
        return null;
    }
}
