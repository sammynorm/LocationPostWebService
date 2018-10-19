package LocationServices;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class LocationController {

    @Autowired
    LocationRepository locationRepository;


    @RequestMapping(value = "/location", method = RequestMethod.POST)
    public Location create(@RequestBody Location location) {
        locationRepository.save(location);
        return location;
    }

    @RequestMapping(value = "/getLocation", method = RequestMethod.GET)
    @ResponseBody
    public Iterable<Location> getFoosBySimplePath() {
        return locationRepository.findAll();
    }
}
