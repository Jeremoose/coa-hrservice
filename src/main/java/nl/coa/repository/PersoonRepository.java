package nl.coa.repository;

import nl.coa.model.Persoon;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersoonRepository extends JpaRepository<Persoon, Long> {
}
