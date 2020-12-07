public class Persona {
    private int id;
    private String nome;
    private String cognome;

    //Costruttore
    public Persona() {
        this.id = -1;
        this.nome = "[nome]";
        this.cognome = "[cognome]";
    }

    public Persona(int id) {
        this.id = id;
        this.nome = "[nome]";
        this.cognome = "[cognome]";
    }

    public Persona(int id, String nome, String cognome) {
        this.id = id;
        this.nome = nome;
        this.cognome = cognome;
    }

    //Getter
    public int getId() {
        return id;
    }
    public String getNome() {
        return nome;
    }
    public String getCognome() {
        return cognome;
    }

    //Setter
    public void setId(int id) {
        this.id = id;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setCognome(String cognome) {
        this.cognome = cognome;
    }
}
