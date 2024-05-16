package kumar.manav.BookMyShow.repositories;

import kumar.manav.BookMyShow.model.ShowSeats;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ShowSeatRepository extends JpaRepository<ShowSeats, Integer> {
}
