package nl.coa.service;

import nl.coa.model.Persoon;
import nl.coa.repository.PersoonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersoonService {
    @Autowired
    private PersoonRepository persoonRepository;

    public List<Persoon> findAll(){
        return persoonRepository.findAll();
    }
}
