package SpringBoot.Farmacie.repository;

import SpringBoot.Farmacie.domain.Angajati;
import SpringBoot.Farmacie.domain.Distribuitor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;


@RepositoryRestResource(collectionResourceRel = "distribuitor", path="distribuitor")
public interface DistribuitorRepo  {
}
