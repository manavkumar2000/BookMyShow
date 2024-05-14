package kumar.manav.BookMyShow.model;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.Setter;

import kumar.manav.BookMyShow.model.constants.ShowSeatStatus;

import java.util.List;

@Getter
@Setter
@Entity
public class ShowSeats extends BaseModel{
    private double price;
    @ManyToOne
    private Show show;
    @ManyToOne
    private Seat seat;
    @Enumerated(EnumType.STRING)
    private ShowSeatStatus showSeatStatus;
}
