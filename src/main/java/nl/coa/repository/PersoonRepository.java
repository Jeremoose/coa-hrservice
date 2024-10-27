package nl.coa.repository;

import nl.coa.model.Persoon;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Repository
@EnableJpaRepositories
@Component
public interface PersoonRepository extends JpaRepository<Persoon, Integer> {
}
