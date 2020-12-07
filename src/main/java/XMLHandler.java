import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import java.io.File;
import java.io.IOException;

public class XMLHandler {
    public XMLHandler() {
        JSONToXML();
    }

    //Metodi
    public void JSONToXML() {
        File xmlFile = new File(JavaHTTPServer.WEB_ROOT + "puntiVendita.xml");

        try {
            XmlMapper xmlMapper = new XmlMapper();
            xmlMapper.writeValue(xmlFile, JSONHandler.getPuntiVendita());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        new JSONHandler();
        for(Object p: JSONHandler.getPuntiVendita().getListaRisultati()) {
            System.out.println(p);
        }
        System.out.println();
        new XMLHandler();
    }
}
