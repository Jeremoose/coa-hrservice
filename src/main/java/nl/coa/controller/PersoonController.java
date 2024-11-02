package nl.coa.controller;

import nl.coa.model.Persoon;
import nl.coa.service.PersoonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class PersoonController {

    @Autowired
    private PersoonService persoonService;

    @GetMapping("/personen")
    public List<Persoon> findAll() {
        return persoonService.findAll();
    }

}
