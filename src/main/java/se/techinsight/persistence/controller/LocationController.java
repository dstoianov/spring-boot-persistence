package se.techinsight.persistence.controller;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;
import se.techinsight.persistence.model.Location;
import se.techinsight.persistence.repository.LocationRepository;

import javax.validation.Valid;
import java.time.LocalDateTime;
import java.util.List;

@Slf4j
@RestController
@RequiredArgsConstructor
@RequestMapping("/location")
public class LocationController {

    private final LocationRepository locationRepository;

    @GetMapping("/all")
    public List<Location> getAll() {
        return locationRepository.findAll();
    }

    @PostMapping
    public Location createLocation(@RequestBody @Valid Location location) {
//        location.setCreatedOn(LocalDateTime.now());
        return locationRepository.save(location);
    }


}
