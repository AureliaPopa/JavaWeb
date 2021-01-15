package SpringBoot.Farmacie.repository;

import SpringBoot.Farmacie.domain.Cos;
import SpringBoot.Farmacie.domain.Distribuitor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "cos", path="cos")

public interface CosRepo  {

}
