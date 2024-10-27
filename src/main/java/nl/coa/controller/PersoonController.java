package nl.coa.controller;

import nl.coa.model.Persoon;
import nl.coa.service.PersoonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/personen")
public class PersoonController {

    @Autowired
    private PersoonService persoonService;

    @GetMapping
    public List<Persoon> findAll() {
        System.out.println("hi");
        return persoonService.findAll();
    }

}
