package BookshelfAPI.BookshelfAPI.repositories;

import BookshelfAPI.BookshelfAPI.models.Shelf;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ShelfRepository extends JpaRepository<Shelf, Integer> {
}
