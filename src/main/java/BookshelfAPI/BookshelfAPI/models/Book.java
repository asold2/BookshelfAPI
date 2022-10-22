package BookshelfAPI.BookshelfAPI.models;



import com.fasterxml.jackson.annotation.JsonIgnore;
import org.springframework.lang.Nullable;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "books")
public class Book  {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int Id;
    private String title;
    private String description;
    private int numberOfPages;
    private int yearPublished;

    @ManyToOne(fetch = FetchType.LAZY, optional = true)
    @JoinColumn(name = "shelf_id")
    @JsonIgnore
    private Shelf shelf;

    public Book(){}

    public Book(String title, String description, int numberOfPages, int yearPublished, Shelf shelf) {
        this.title = title;
        this.description = description;
        this.numberOfPages = numberOfPages;
        this.yearPublished = yearPublished;
        this.shelf = shelf;
    }

    public Book(String title, String description, int numberOfPages, int yearPublished) {
        this.title = title;
        this.description = description;
        this.numberOfPages = numberOfPages;
        this.yearPublished = yearPublished;
    }

    public int getId() {
        return Id;
    }
    public void setId(int id) {
        Id = id;
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
    public Shelf getShelf() {
        return shelf;
    }
    public void setShelf(Shelf shelf) {
        this.shelf = shelf;
    }
}
