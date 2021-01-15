package SpringBoot.Farmacie;

import SpringBoot.Farmacie.repository.MedicamenteRepo;
import SpringBoot.Farmacie.repository.PacientiRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class FarmacieApplication   {


	public static void main(String[] args) {
		SpringApplication.run(FarmacieApplication.class, args);
	}

}
