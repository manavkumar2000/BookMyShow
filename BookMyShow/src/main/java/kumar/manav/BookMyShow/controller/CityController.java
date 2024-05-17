package kumar.manav.BookMyShow.controller;

import kumar.manav.BookMyShow.dto.CityRequestDTO;
import kumar.manav.BookMyShow.model.City;
import kumar.manav.BookMyShow.services.CityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@Controller
public class CityController {
    @Autowired
    private CityService cityService;

    @GetMapping("/city")
    public ResponseEntity getAllCities() {
        List<City> cities = cityService.findAll();
        return ResponseEntity.ok(cities);
    }

    @PostMapping("/city")
    public ResponseEntity createCity(@RequestBody CityRequestDTO cityRequestDTO){
        try{
            String cityName = cityRequestDTO.getName();
            if(cityName == null || cityName.isEmpty() || cityName.isBlank()) {
                throw new Exception("City Name is invalid");
            }
            City savedCity = cityService.saveCity(cityName);
            return ResponseEntity.ok(savedCity); // we would return cityResponseDTO
        }catch (Exception e){
            e.printStackTrace();
        }
        return null;
    }
}
