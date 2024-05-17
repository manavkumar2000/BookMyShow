package kumar.manav.BookMyShow.services;

import kumar.manav.BookMyShow.model.Actor;
import kumar.manav.BookMyShow.repositories.ActorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ActorService {
    @Autowired
    private ActorRepository actorRepository;

    public List<Actor> findAll() {
        return actorRepository.findAll();
    }
    public Actor findById(int id) {
        return actorRepository.findById(id).get();
    }
    public Actor save(Actor actor) {
        return actorRepository.save(actor);
    }
    public Actor update(Actor actor) {
        return actorRepository.save(actor);
    }
    public boolean deleteActorById(int id) {
        actorRepository.deleteById(id);
        return true;
    }
}
