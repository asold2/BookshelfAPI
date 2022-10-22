package BookshelfAPI.BookshelfAPI.dtos;
import org.springframework.lang.Nullable;
import java.io.Serializable;

public class BookDto implements Serializable {
    private String title;
    private String description;
    private int numberOfPages;
    private int yearPublished;
    @Nullable
    private int shelfId;

    public BookDto (){}
    public BookDto(String title, String description, int numberOfPages, int yearPublished) {
        this.title = title;
        this.description = description;
        this.numberOfPages = numberOfPages;
        this.yearPublished = yearPublished;
    }

    public BookDto(String title, String description, int numberOfPages, int yearPublished, int shelfId) {
        this.title = title;
        this.description = description;
        this.numberOfPages = numberOfPages;
        this.yearPublished = yearPublished;
        this.shelfId = shelfId;
    }

    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public int getNumberOfPages() {
        return numberOfPages;
    }
    public void setNumberOfPages(int numberOfPages) {
        this.numberOfPages = numberOfPages;
    }
    public int getYearPublished() {
        return yearPublished;
    }
    public void setYearPublished(int yearPublished) {
        this.yearPublished = yearPublished;
    }
    public int getShelfId() {
        return shelfId;
    }
    public void setShelfId(int shelfId) {
        this.shelfId = shelfId;
    }
}


