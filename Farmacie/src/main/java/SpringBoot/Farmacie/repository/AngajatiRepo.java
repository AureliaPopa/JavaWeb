package SpringBoot.Farmacie.repository;

import SpringBoot.Farmacie.domain.Angajati;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;


//@CrossOrigin("http://localhost:4200")
@RepositoryRestResource(collectionResourceRel = "angajati", path="angajati")
public interface AngajatiRepo {


}
