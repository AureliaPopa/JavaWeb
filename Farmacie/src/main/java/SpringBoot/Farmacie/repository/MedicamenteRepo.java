package SpringBoot.Farmacie.repository;

import SpringBoot.Farmacie.domain.Angajati;
import SpringBoot.Farmacie.domain.Medicamente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
@RepositoryRestResource(collectionResourceRel = "medicamente", path="medicamente")
public interface MedicamenteRepo {


    List<Medicamente> queryMedicamente();

    List<Medicamente> queryMedicamenteById(int productId);

    List<Medicamente> queryMedicamenteByName(String name);

    int insertMedicament(Medicamente medicament);

    int updatedMedicament(Medicamente medicament);

    int deleteMedicament(int medicamentId);

    int queryCountMedicamente();

    List<Medicamente> querySortByPrice();

    List<Medicamente> querySortByPriceDesc();

    List<Medicamente> queryForAntibiotice();

    List<Medicamente> queryForVitamine();


}
