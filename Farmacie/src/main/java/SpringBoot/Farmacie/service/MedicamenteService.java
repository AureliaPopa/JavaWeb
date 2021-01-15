package SpringBoot.Farmacie.service;

import SpringBoot.Farmacie.domain.Medicamente;

import java.util.List;

public interface MedicamenteService  {

    List<Medicamente> getMedicamenteList();
    List<Medicamente> getMedicamenteById(int medicamentId);
    List<Medicamente> getMedicamenteByName(String nume);

    boolean addMedicamente(Medicamente medicamente);

    boolean modifyMedicamente(Medicamente medicamente);

    boolean deleteMedicamente(int medicamentId);

    int countMedicamente();

    List<Medicamente> sortByMedicamentPrice();
    List<Medicamente> sortByMedicamentDesc();
    List<Medicamente> searchForAntibiotice();
    List<Medicamente> searchForVitamine();

}
