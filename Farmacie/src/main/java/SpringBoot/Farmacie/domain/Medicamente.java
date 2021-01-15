package SpringBoot.Farmacie.domain;

import lombok.Data;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;


public class Medicamente {
    private Long idMedicament;

    public String getCategorie() {
        return categorie;
    }

    public void setCategorie(String categorie) {
        this.categorie = categorie;
    }

    private String categorie;

    private String numeMedicament;

    private int pret;


    private int unitatiStoc;
    public Long getIdMedicament() {
        return idMedicament;
    }

    public void setIdMedicament(Long idMedicament) {
        this.idMedicament = idMedicament;
    }



    public String getNumeMedicament() {
        return numeMedicament;
    }

    public void setNumeMedicament(String numeMedicament) {
        this.numeMedicament = numeMedicament;
    }

    public int getPret() {
        return pret;
    }

    public void setPret(int pret) {
        this.pret = pret;
    }

    public int getUnitatiStoc() {
        return unitatiStoc;
    }

    public void setUnitatiStoc(int unitatiStoc) {
        this.unitatiStoc = unitatiStoc;
    }



}
