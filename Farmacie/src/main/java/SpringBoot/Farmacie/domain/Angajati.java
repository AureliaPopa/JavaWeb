package SpringBoot.Farmacie.domain;

import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;
import java.util.Set;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;


public class Angajati {


    private Long idangajati;

    private String nume;


    private String prenume;


    private int cnp;


    private String parola;

}
