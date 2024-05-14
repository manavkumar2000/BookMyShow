package kumar.manav.BookMyShow.model;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

import java.util.List;
@Getter
@Setter
@Entity

public class Theater extends BaseModel{
    private String name;
    private String address;
    private List<Auditorium> auditoriums;
}
