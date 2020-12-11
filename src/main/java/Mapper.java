
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;

import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamReader;
import java.io.FileReader;
import java.io.IOException;

public class Mapper {
    public static void main(String[] args) throws IOException, XMLStreamException {

        XmlMapper mapper = new XmlMapper();
        XMLInputFactory xmlInputFactory = XMLInputFactory.newFactory();
        FileReader fileReader = new FileReader("C:\\Users\\lenovo\\IdeaProjects\\x_json\\Jackson\\src\\main\\resources\\planet.xml");
        XMLStreamReader xmlStreamReader = xmlInputFactory.createXMLStreamReader(fileReader);

        Planet planet = mapper.readValue(xmlStreamReader, Planet.class);

        ObjectMapper jsonMapper = new ObjectMapper();
        String json = jsonMapper.writeValueAsString(planet);
        System.out.println(json);

    }
}
