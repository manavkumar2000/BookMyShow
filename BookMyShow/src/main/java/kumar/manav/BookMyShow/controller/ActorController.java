package kumar.manav.BookMyShow.controller;

import kumar.manav.BookMyShow.services.ActorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class ActorController {
    @Autowired
    private ActorService actorService;


}
