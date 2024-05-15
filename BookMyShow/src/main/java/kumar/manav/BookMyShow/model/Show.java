package kumar.manav.BookMyShow.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.List;

@Getter
@Setter
@Entity
public class Show extends BaseModel{
    @ManyToOne
    private Auditorium auditorium;
    @ManyToOne
    private Movie movie;
    private LocalDateTime startTime;
    private LocalDateTime endTime;
    @OneToMany
    private List<ShowSeats> showSeats;

}
