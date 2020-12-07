import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;

import java.io.File;
import java.io.IOException;

public class JSON_XML {
    public static void serialiseJSON(Persone persone) {
        ObjectMapper objectMapper = new ObjectMapper();
        try {
            objectMapper.writeValue(new File(JavaHTTPServer.WEB_ROOT + "/db/db.json"), persone);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static void serialiseXML(Persone persone) {
        XmlMapper xmlMapper = new XmlMapper();
        try {
            xmlMapper.writeValue(new File(JavaHTTPServer.WEB_ROOT + "/db/db.xml"), persone);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
