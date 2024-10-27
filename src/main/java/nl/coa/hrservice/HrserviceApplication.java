package nl.coa.hrservice;

import nl.coa.repository.PersoonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class HrserviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(HrserviceApplication.class, args);
	}

	@Autowired
	PersoonRepository persoonRepository;

}
