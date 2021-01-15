package SpringBoot.Farmacie.service.impl;

import SpringBoot.Farmacie.domain.Medicamente;
import SpringBoot.Farmacie.repository.MedicamenteRepo;
import SpringBoot.Farmacie.service.MedicamenteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MedicamenteServiceImp  implements MedicamenteService{

        @Autowired
        private MedicamenteRepo medicamenteRepo;

    @Override
    public List<Medicamente> getMedicamenteList() {
        return medicamenteRepo.queryMedicamente();
    }

    @Override
    public List<Medicamente> getMedicamenteById(int medicamentId) {
        return medicamenteRepo.queryMedicamenteById(medicamentId);
    }

    @Override
    public List<Medicamente> getMedicamenteByName(String nume) {
        return medicamenteRepo.queryMedicamenteByName(nume);
    }


    @Override
    public boolean addMedicamente(Medicamente medicamente) {
        medicamenteRepo.insertMedicament(medicamente);
        return true;
        /*if (medicamente.getNumeMedicament() != null && !"".equals(medicamente.getNumeMedicament()) && medicamente.getUnitatiStoc() != 0 && medicamente.getCategorie() != null && !"".equals(medicamente.getCategorie()))
        {
            try {
                int effectedNum = medicamenteRepo.insertMedicament(medicamente);
                if (effectedNum>0)
                {
                    return true;
                }
                else
                {
                    throw new RuntimeException("Insert failed!");
                }
            }
            catch (Exception e)
            {
                throw new RuntimeException("Insert failed:" + e.getMessage());
            }

        }
        else
        {
            throw new RuntimeException("Insert data can not be null!!");
        }*/
    }

    @Override
    public boolean modifyMedicamente(Medicamente medicamente) {
        if (medicamente.getIdMedicament() != null && medicamente.getIdMedicament() > 0)
        {
            try {
                int effectedNum = medicamenteRepo.updatedMedicament(medicamente);
                if (effectedNum > 0)
                {
                    return true;
                }
                else
                {
                    throw new RuntimeException("Update failed");
                }
            }
            catch (Exception e)
            {
                throw new RuntimeException("Update failed" + e.toString());
            }
        }
        else
        {
            throw new RuntimeException("data can not be null");
        }
    }

    @Override
    public boolean deleteMedicamente(int medicamentId) {
        if (medicamentId > 0)
        {
            try {
                int effectedNum = medicamenteRepo.deleteMedicament(medicamentId);
                if (effectedNum > 0)
                {
                    return true;
                }
                else
                {
                    throw new RuntimeException("Delete failed");
                }
            }
            catch (Exception e)
            {
                throw new RuntimeException("Delete failed" + e.toString());
            }
        }
        else
        {
            throw new RuntimeException("productId can not be null!");
        }
    }

    @Override
    public int countMedicamente() {
        return medicamenteRepo.queryCountMedicamente();
    }

    @Override
    public List<Medicamente> sortByMedicamentPrice() {
        return medicamenteRepo.querySortByPrice();
    }

    @Override
    public List<Medicamente> sortByMedicamentDesc() {
        return medicamenteRepo.querySortByPriceDesc();
    }

    @Override
    public List<Medicamente> searchForAntibiotice() {
        return medicamenteRepo.queryForAntibiotice();
    }

    @Override
    public List<Medicamente> searchForVitamine() {
        return medicamenteRepo.queryForVitamine();
    }
}
