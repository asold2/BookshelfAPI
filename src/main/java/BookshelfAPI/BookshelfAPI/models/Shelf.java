package BookshelfAPI.BookshelfAPI.models;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import javax.persistence.*;
import java.io.Serializable;
import java.util.*;

@Entity
@Table(name = "shelves")

public class Shelf implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int Id;
    private String name;
    @OneToMany(mappedBy = "shelf", fetch = FetchType.LAZY)
    @JsonManagedReference
    private List<Book> books;

    public Shelf(){}

    public Shelf(String name) {
        this.name = name;
        this.books = new ArrayList<>();
    }

    public int getId() {
        return Id;
    }
    public void setId(int id) {
        Id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public List<Book> getBooks() {
        return books;
    }
    public void setBooks(List<Book> books) {
        this.books = books;
    }
}
