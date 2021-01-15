package SpringBoot.Farmacie.service.impl;

import SpringBoot.Farmacie.domain.Pacienti;
import SpringBoot.Farmacie.repository.PacientiRepo;
import SpringBoot.Farmacie.service.PacientiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.List;
@Service


public class PacientiServiceImp implements PacientiService {
@Autowired
    PacientiRepo pacientiRepo;
    @Transactional
    @Override
    public boolean addPacienti(Pacienti pacienti) {

    pacientiRepo.insertPacienti(pacienti);
    return true;
    }

    @Override
    public List<Pacienti> searchPacienti(String nume) {
        return pacientiRepo.searchPacienti(nume);
    }
}
