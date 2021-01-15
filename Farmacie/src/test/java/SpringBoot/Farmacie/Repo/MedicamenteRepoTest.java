package SpringBoot.Farmacie.Repo;

import SpringBoot.Farmacie.domain.Medicamente;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import SpringBoot.Farmacie.repository.MedicamenteRepo;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest

public class MedicamenteRepoTest {

    @Autowired
    private MedicamenteRepo medicamenteRepo;

    @Test
    @Ignore
    public void query() {
        List<Medicamente> medList = medicamenteRepo.queryMedicamente();
        assertEquals(6 ,medList .size());
    }

    @Test
    @Ignore
    public void queryMedicamenteById() {
        List<Medicamente> medicamente= medicamenteRepo.queryMedicamenteById(1);
        assertEquals(1, medicamente.size());
    }

    @Test
    @Ignore
    public void queryCountMedicamente() {
        int result = medicamenteRepo.queryCountMedicamente();
        assertEquals(6,result);
    }


    @Test
    //@Ignore
    public void sortByPret() {
        List<Medicamente> medicamenteListByPrice = medicamenteRepo.querySortByPrice();
        assertEquals(6, medicamenteListByPrice.size());
    }

    @Test
    //@Ignore
    public void sortByPretDesc() {
        List<Medicamente> medicamenteListByPrice = medicamenteRepo.querySortByPriceDesc();
        assertEquals(6, medicamenteListByPrice.size());
    }

    @Test
    @Ignore
    public void insertMedicamente() {
        Medicamente med = new Medicamente();
        med.setNumeMedicament("Anit1");
        med.setPret(99);
        med.setCategorie("antibiotice");
        med.setUnitatiStoc(88);
        int effectedNum = medicamenteRepo.insertMedicament(med);
        assertEquals(1,effectedNum);

    }

    @Test
    @Ignore
    public void updatedMedicamente() {
        Medicamente med = new Medicamente();
        med.setNumeMedicament("Anit2");
        med.setPret(22);
        med.setCategorie("antibiotice");
        med.setUnitatiStoc(82);
        int effectedNum = medicamenteRepo.updatedMedicament(med);
        assertEquals(1,effectedNum);
    }

    @Test
    @Ignore
    public void deleteMedicamente() {
        int effectedNum = medicamenteRepo.deleteMedicament(7);
        assertEquals(1,effectedNum);
    }
    }
