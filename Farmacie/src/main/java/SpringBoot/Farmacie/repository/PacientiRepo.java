package SpringBoot.Farmacie.repository;

import SpringBoot.Farmacie.domain.Medicamente;
import SpringBoot.Farmacie.domain.Pacienti;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@RepositoryRestResource(collectionResourceRel = "pacienti", path="pacienti")
public interface PacientiRepo  {

    int insertPacienti(Pacienti pacienti);
    List<Pacienti> searchPacienti (String name);
    int queryPacienti();
}
