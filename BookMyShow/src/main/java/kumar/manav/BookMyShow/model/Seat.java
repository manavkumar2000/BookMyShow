package kumar.manav.BookMyShow.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import kumar.manav.BookMyShow.model.constants.SeatStatus;
import kumar.manav.BookMyShow.model.constants.SeatType;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.JdbcType;
import org.hibernate.type.descriptor.jdbc.VarcharJdbcType;

@Getter
@Setter
@Entity
public class Seat extends BaseModel{
    private int seatNumber;
    private int seatRow;
    private int seatCol;
    @Enumerated(EnumType.STRING)
    private SeatStatus seatStatus;
    @Enumerated(EnumType.STRING)
    private SeatType seatType;

}
