package kumar.manav.BookMyShow.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import kumar.manav.BookMyShow.model.constants.TicketStatus;
import java.time.LocalDateTime;
import java.util.List;

@Getter
@Setter
@Entity
public class Ticket extends BaseModel{
    @OneToOne
    private Show show;
    @OneToMany
    private List<ShowSeats> showSeats;
    private LocalDateTime timeOfBooking;
    private double amount;
    @Enumerated(EnumType.STRING)
    private TicketStatus ticketStatus;
}
