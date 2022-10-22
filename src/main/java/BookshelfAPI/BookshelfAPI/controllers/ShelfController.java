package BookshelfAPI.BookshelfAPI.controllers;
import BookshelfAPI.BookshelfAPI.dtos.ShelfDto;
import BookshelfAPI.BookshelfAPI.models.Shelf;
import BookshelfAPI.BookshelfAPI.service.ShelfService;
import BookshelfAPI.BookshelfAPI.service.ShelfServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.*;


@RestController
public class ShelfController {

    @Autowired
    private ShelfService shelfService;

    public ShelfController() {
        this.shelfService = new ShelfServiceImpl();
    }

    @PostMapping("/shelf")
    public ResponseEntity createBookShelf(@RequestBody ShelfDto shelfDto){

        Shelf newShelf = new Shelf(shelfDto.getName());

        shelfService.createShelf(newShelf);

        return new ResponseEntity(HttpStatus.OK);
    }

    @GetMapping("shelves")
    public ResponseEntity<List<Shelf>> getAllShelves(){

        List<Shelf> shelves = shelfService.getAllShelves();

        return  ResponseEntity.status(HttpStatus.OK).body(shelves);
    }

    @GetMapping("shelf/{id}")
    public ResponseEntity<Shelf> getShelfById(@PathVariable("id") int id){
        Shelf shelf = shelfService.getShelfById(id);

        return ResponseEntity.status(HttpStatus.OK).body(shelf);
    }
}
