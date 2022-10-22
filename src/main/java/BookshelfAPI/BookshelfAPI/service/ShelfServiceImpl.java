package BookshelfAPI.BookshelfAPI.service;
import BookshelfAPI.BookshelfAPI.models.Shelf;
import BookshelfAPI.BookshelfAPI.repositories.ShelfRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import java.util.*;

@Service
public class ShelfServiceImpl implements ShelfService{

    @Autowired
    ShelfRepository shelfRepository;

    @Override
    public void createShelf(Shelf shelf) {
        shelfRepository.save(shelf);
    }

    @Override
    public Shelf getShelfById(int shelfId) {
        if(shelfRepository.findById(shelfId).isPresent()){
            return  shelfRepository.findById(shelfId).get();
        }
        return  null;
    }

    @Override
    public List<Shelf> getAllShelves() {
        return shelfRepository.findAll();
    }
}
