package kumar.manav.BookMyShow.repositories;

import kumar.manav.BookMyShow.model.Actor;
import kumar.manav.BookMyShow.model.Theater;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TheaterRepository extends JpaRepository<Theater, Integer> {
}
