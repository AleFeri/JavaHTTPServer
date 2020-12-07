import java.util.ArrayList;

public class PuntiVendita {
    int size;
    private ArrayList listaRisultati;

    //Getter
    public ArrayList getListaRisultati() {
        return listaRisultati;
    }
    public int getSize() {
        return listaRisultati.size();
    }

    //Setter
    public void setListaRisultati(ArrayList puntiVendita) {
        this.listaRisultati = puntiVendita;
    }
    public void setSize(int size) {
        this.size = size;
    }

    //Costruttore
    public PuntiVendita() {
        size = -1;
        listaRisultati = new ArrayList<>();
    }

    public PuntiVendita(ArrayList puntiVendita) {
        this.listaRisultati = puntiVendita;
        size = puntiVendita.size();
    }
}
