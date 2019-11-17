package sin.java.testdata.harrypotter.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import sin.java.testdata.harrypotter.domain.Character;

@Repository
public interface CharacterRepository extends JpaRepository<Character,Long> {
}
