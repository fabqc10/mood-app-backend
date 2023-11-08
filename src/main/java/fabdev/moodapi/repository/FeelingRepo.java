package fabdev.moodapi.repository;

import fabdev.moodapi.model.Feeling;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

public interface FeelingRepo extends JpaRepository<Feeling, Long> {
}
