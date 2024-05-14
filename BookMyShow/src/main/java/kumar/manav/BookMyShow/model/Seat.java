package kumar.manav.BookMyShow.model;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import kumar.manav.BookMyShow.model.constants.SeatStatus;
import kumar.manav.BookMyShow.model.constants.SeatType;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Seat extends BaseModel{
    private int seatNumber;
    private int row;
    private int col;
    @Enumerated(EnumType.STRING)
    private SeatStatus seatStatus;
    @Enumerated(EnumType.STRING)
    private SeatType seatType;

}
