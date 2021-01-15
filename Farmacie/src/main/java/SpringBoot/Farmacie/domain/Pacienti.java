package SpringBoot.Farmacie.domain;


public class Pacienti {


    private Long idPacienti;

    public Long getIdPacienti() {
        return idPacienti;
    }

    public void setIdPacienti(Long idPacienti) {
        this.idPacienti = idPacienti;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public String getPrenume() {
        return prenume;
    }

    public void setPrenume(String prenume) {
        this.prenume = prenume;
    }

    public int getCnp() {
        return cnp;
    }

    public void setCnp(int cnp) {
        this.cnp = cnp;
    }

    public String getAdresa() {
        return adresa;
    }

    public void setAdresa(String adresa) {
        this.adresa = adresa;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    private String nume;
    private String prenume;
    private int cnp;
    private String adresa;
    private String email;

    public String getParola() {
        return parola;
    }

    public void setParola(String parola) {
        this.parola = parola;
    }

    private String parola;

}
