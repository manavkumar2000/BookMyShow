package kumar.manav.BookMyShow.model;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import lombok.Getter;
import lombok.Setter;

import java.util.List;
@Setter
@Getter
@Entity
public class City extends BaseModel{
    private String name;
    @OneToMany
    private List<Theater> theaters;

}
