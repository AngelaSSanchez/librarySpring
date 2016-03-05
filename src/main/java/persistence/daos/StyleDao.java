package persistence.daos;

import org.springframework.data.jpa.repository.JpaRepository;

import persistence.entities.Style;

public interface StyleDao extends JpaRepository<Style, Integer> {
    Style findByNameIgnoreCase(String name);
}
