package nl.coa.service;

import nl.coa.model.Inschrijving;
import nl.coa.repository.InschrijvingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class InschrijvingService {

    @Autowired
    private InschrijvingRepository inschrijvingRepository;

    public List<Inschrijving> findAll() { return inschrijvingRepository.findAll();}




}
