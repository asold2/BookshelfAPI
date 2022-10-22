package BookshelfAPI.BookshelfAPI.repositories;

import BookshelfAPI.BookshelfAPI.models.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
@Component
@Repository
public interface BookRepository extends JpaRepository<Book, Integer> {
}
