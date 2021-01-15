package SpringBoot.Farmacie.service;

import SpringBoot.Farmacie.domain.Pacienti;

import java.util.List;

public interface PacientiService {

    boolean addPacienti(Pacienti pacienti);
    List<Pacienti> searchPacienti(String nume);
}
