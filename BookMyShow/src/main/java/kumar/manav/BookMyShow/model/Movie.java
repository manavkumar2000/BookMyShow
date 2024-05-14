package kumar.manav.BookMyShow.model;

import jakarta.persistence.Entity;
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
    private List<Director> directors;
    private List<Actor> actors;
    private Genre genre;
    private List<MovieFeatures> movieFeatures;
}
