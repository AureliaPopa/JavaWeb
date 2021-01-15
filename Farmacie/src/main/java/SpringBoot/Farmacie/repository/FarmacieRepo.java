package SpringBoot.Farmacie.repository;

import SpringBoot.Farmacie.domain.Farmacie;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

//@CrossOrigin("http://localhost:4200")
@RepositoryRestResource(collectionResourceRel = "farmacie", path="farmacie")
public interface FarmacieRepo  {
}
