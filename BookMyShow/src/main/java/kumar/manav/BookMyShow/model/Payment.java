package kumar.manav.BookMyShow.model;

import jakarta.persistence.*;
import kumar.manav.BookMyShow.model.constants.PaymentMode;
import kumar.manav.BookMyShow.model.constants.PaymentStatus;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Entity
@Getter
@Setter
public class Payment extends BaseModel{
    private LocalDateTime paymentTime;
    private Double amount;
    @Enumerated(EnumType.STRING)
    private PaymentStatus paymentStatus;
    @OneToOne
    private Ticket ticket;
    @Enumerated(EnumType.STRING)
    private PaymentMode paymentMode;
}
