package nl.coa.controller;

import nl.coa.model.Inschrijving;
import nl.coa.service.InschrijvingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class InschrijvingController {

    @Autowired
    private InschrijvingService inschrijvingService;

    @GetMapping("/inschrijvingen")
    public List<Inschrijving> findAll() {
        return inschrijvingService.findAll();
    }

}
