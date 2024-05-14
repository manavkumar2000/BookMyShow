package kumar.manav.BookMyShow.model;

import jakarta.persistence.*;
import kumar.manav.BookMyShow.model.constants.Genre;
import kumar.manav.BookMyShow.model.constants.MovieFeatures;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@Entity
public class Movie extends BaseModel{

    private String name;
    @ManyToMany
    private List<Director> directors;
    @Enumerated(EnumType.STRING)
    private Genre genre;
    @Enumerated(EnumType.STRING)
    @ElementCollection
    private List<MovieFeatures> movieFeatures;
}
