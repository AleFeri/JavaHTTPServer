import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.File;

public class JSONHandler {
    private static PuntiVendita puntiVendita;

    //Getter
    public static PuntiVendita getPuntiVendita() {
        return puntiVendita;
    }

    //costruttore
    public JSONHandler() {
        puntiVendita = getPVList();
    }

    //metodi
    private static PuntiVendita getPVList() {
        try {
            // create object mapper instance
            ObjectMapper mapper = new ObjectMapper();

            // convert JSON string to Book object
            return mapper.readValue(new File(JavaHTTPServer.WEB_ROOT + "/puntiVendita.json"), PuntiVendita.class);

        } catch (Exception ex) {
            ex.printStackTrace();
        }

        return null;
    }

    public static void main(String[] args) {
        JSONHandler jsonHandler = new JSONHandler();
        for(Object p: JSONHandler.getPuntiVendita().getListaRisultati()) {
            System.out.println(p);
        }
    }
}
