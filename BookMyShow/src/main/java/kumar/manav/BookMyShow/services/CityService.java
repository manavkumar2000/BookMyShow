package kumar.manav.BookMyShow.services;

import kumar.manav.BookMyShow.model.Actor;
import kumar.manav.BookMyShow.model.City;
import kumar.manav.BookMyShow.repositories.CityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.AutoConfigureOrder;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CityService {
    @Autowired
    private CityRepository cityRepository;

    public List<City> findAll() {
        return cityRepository.findAll();
    }
    public City save(City city) {
        return cityRepository.save(city);
    }
    public City saveCity(String name)
    {
        City city = new City();
        city.setName(name);
        return cityRepository.save(city);
    }
}
