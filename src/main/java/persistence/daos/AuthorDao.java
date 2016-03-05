package persistence.daos;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import persistence.entities.Author;
import persistence.entities.Style;

public interface AuthorDao extends JpaRepository<Author, Integer> {

	List<Author> findByStyle(Style style);
	
	List<String> findNameByStyleName(String styleName);
	
	@Query("select distinct author.name from Book book join book.authorList author")
	List<String> findDistinctNameByBook();
	
	@Query("SELECT author.name FROM Book book join book.themeList theme join book.autorList author where theme.name = ?1")
	List<String> findNameByThemeName(String themeName);

}
