package SpringBoot.Farmacie.domain;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;
import javax.persistence.*;
import java.util.Set;


public class Farmacie {

    private Long idFarmacie;


    private String numeFarmacie;
    private int telefon;



}
