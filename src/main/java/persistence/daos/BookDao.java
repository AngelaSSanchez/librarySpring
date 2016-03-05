package persistence.daos;

import org.springframework.data.jpa.repository.JpaRepository;

import persistence.entities.Book;

public interface BookDao extends JpaRepository<Book, Integer> {
}
