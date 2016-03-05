package persistence.daos;

import org.springframework.data.jpa.repository.JpaRepository;

import persistence.entities.Theme;

public interface ThemeDao extends JpaRepository<Theme, Integer> {
}
