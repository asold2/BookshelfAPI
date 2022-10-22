package BookshelfAPI.BookshelfAPI.service;
import BookshelfAPI.BookshelfAPI.models.Shelf;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public interface ShelfService {
    void createShelf(Shelf shelf);
    Shelf getShelfById(int shelfId);
    List<Shelf>  getAllShelves();
}
