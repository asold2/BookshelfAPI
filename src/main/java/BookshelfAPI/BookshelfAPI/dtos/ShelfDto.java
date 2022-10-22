package BookshelfAPI.BookshelfAPI.dtos;
import BookshelfAPI.BookshelfAPI.models.Shelf;
import java.io.Serializable;

public class ShelfDto implements Serializable {
    private String name;

    public ShelfDto(){}
    public ShelfDto(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
}
