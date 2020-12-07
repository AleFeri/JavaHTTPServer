public class PuntoVendita {
    private int idPuntoVendita;
    private String denominazione;
    private String indirizzo;
    private String cap;
    private String comune;
    private String codProvincia;
    private String urlSito;
    private String telefonoPrincipale;
    private String telefonoSecondario;
    private String email;
    private String latitudine;
    private String longitudine;
    private String flagFisicoOnline;
    private int idEsercente;
    private String ragioneSociale;

    //getter
    public int getIdPuntoVendita() {
        return idPuntoVendita;
    }
    public String getDenominazione() {
        return denominazione;
    }
    public String getIndirizzo() {
        return indirizzo;
    }
    public String getCap() {
        return cap;
    }
    public String getComune() {
        return comune;
    }
    public String getCodProvincia() {
        return codProvincia;
    }
    public String getUrlSito() {
        return urlSito;
    }
    public String getTelefonoPrincipale() {
        return telefonoPrincipale;
    }
    public String getTelefonoSecondario() {
        return telefonoSecondario;
    }
    public String getEmail() {
        return email;
    }
    public String getLatitudine() {
        return latitudine;
    }
    public String getLongitudine() {
        return longitudine;
    }
    public String getFlagFisicoOnline() {
        return flagFisicoOnline;
    }
    public int getIdEsercente() {
        return idEsercente;
    }
    public String getRagioneSociale() {
        return ragioneSociale;
    }

    //Setter
    public void setIdPuntoVendita(int id) {
        this.idPuntoVendita = id;
    }
    public void setDenominazione(String denominazione) {
        this.denominazione = denominazione;
    }
    public void setIndirizzo(String indirizzo) {
        this.indirizzo = indirizzo;
    }
    public void setCap(String cap) {
        this.cap = cap;
    }
    public void setComune(String comune) {
        this.comune = comune;
    }
    public void setCodProvincia(String codProvincia) {
        this.codProvincia = codProvincia;
    }
    public void setUrlSito(String urlSito) {
        this.urlSito = urlSito;
    }
    public void setTelefonoPrincipale(String telefonoPrincipale) {
        this.telefonoPrincipale = telefonoPrincipale;
    }
    public void setTelefonoSecondario(String telefonoSecondario) {
        this.telefonoSecondario = telefonoSecondario;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public void setLatitudine(String latitudine) {
        this.latitudine = latitudine;
    }
    public void setLongitudine(String longitudine) {
        this.longitudine = longitudine;
    }
    public void setFlagFisicoOnline(String flagFisicoOnline) {
        this.flagFisicoOnline = flagFisicoOnline;
    }
    public void setIdEsercente(int idEsercente) {
        this.idEsercente = idEsercente;
    }
    public void setRagioneSociale(String ragioneSociale) {
        this.ragioneSociale = ragioneSociale;
    }

    //Costruttore
    public PuntoVendita() {
        this.idPuntoVendita = -1;
        this.denominazione = null;
        this.indirizzo = null;
        this.cap = null;
        this.comune = null;
        this.codProvincia = null;
        this.urlSito = null;
        this.telefonoPrincipale = null;
        this.telefonoSecondario = null;
        this.email = null;
        this.latitudine = null;
        this.longitudine = null;
        this.flagFisicoOnline = null;
        this.idEsercente = -1;
        this.ragioneSociale = null;
    }
    public PuntoVendita(int id, String denominazione, String indirizzo, String cap, String comune, String codProvincia, String urlSito, String telefonoPrincipale, String telefonoSecondario, String email, String latitudine, String longitudine, String flagFisicoOnline, int idEsercente, String ragioneSociale) {
        this.idPuntoVendita = id;
        this.denominazione = denominazione;
        this.indirizzo = indirizzo;
        this.cap = cap;
        this.comune = comune;
        this.codProvincia = codProvincia;
        this.urlSito = urlSito;
        this.telefonoPrincipale = telefonoPrincipale;
        this.telefonoSecondario = telefonoSecondario;
        this.email = email;
        this.latitudine = latitudine;
        this.longitudine = longitudine;
        this.flagFisicoOnline = flagFisicoOnline;
        this.idEsercente = idEsercente;
        this.ragioneSociale = ragioneSociale;
    }

    //Override
    @Override
    public String toString() {
        return "PuntoVendita{" +
                "id=" + idPuntoVendita +
                ", denominazione='" + denominazione + '\'' +
                ", indirizzo='" + indirizzo + '\'' +
                ", cap='" + cap + '\'' +
                ", comune='" + comune + '\'' +
                ", codProvincia='" + codProvincia + '\'' +
                ", urlSito='" + urlSito + '\'' +
                ", telefonoPrincipale='" + telefonoPrincipale + '\'' +
                ", telefonoSecondario='" + telefonoSecondario + '\'' +
                ", email='" + email + '\'' +
                ", latitudine='" + latitudine + '\'' +
                ", longitudine='" + longitudine + '\'' +
                ", flagFisicoOnline='" + flagFisicoOnline + '\'' +
                ", idEsercente=" + idEsercente +
                ", ragioneSociale='" + ragioneSociale + '\'' +
                '}';
    }
}
