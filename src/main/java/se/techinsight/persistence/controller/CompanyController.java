package se.techinsight.persistence.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import se.techinsight.persistence.model.Company;
import se.techinsight.persistence.repository.CompanyRepository;

import javax.validation.Valid;
import java.time.LocalDateTime;
import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/company")
public class CompanyController {

    private final CompanyRepository repository;

    @GetMapping("/all")
    public List<Company> getAll() {
        return repository.findAll();
    }


    @PostMapping
    public Company createLocation(@RequestBody @Valid Company company){

        company.setCreatedOn(LocalDateTime.now());

        return repository.save(company);
    }
}
