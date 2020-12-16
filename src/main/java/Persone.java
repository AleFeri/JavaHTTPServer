import java.util.ArrayList;
import java.util.List;

public class Persone {
    private int size;
    private List<Persona> personeArray;

    //Costruttore
    public Persone() {
        personeArray = new ArrayList<>();
        size = getSize();
    }

    //Getter
    public List<Persona> getPersoneArray() {
        return personeArray;
    }
    public int getSize() {
        return personeArray.size();
    }

    //Metodi
    public void add(Persona persona) {
        personeArray.add(persona);
    }
    public boolean remove(Persona persona) {
        return personeArray.remove(persona);
    }
}
