package creational;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.stream.XMLStreamException;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.UnsupportedEncodingException;

public class Main {

    public static void main(String[] args) throws XMLStreamException, IOException {

        BookMetadataExporter exporter = new JSONBookMetadataExporter();
        exporter.add(TestData.sailboatBook);
        exporter.add(TestData.GoFBook);
        exporter.export(System.out);

        BookMetadataExporter exporterXML = new XMLBookMetadataExporter();
        exporterXML.add(TestData.sailboatBook);
        exporterXML.add(TestData.GoFBook);
        exporterXML.export(System.out);

        BookMetadataExporter exporterCSV = new CSVBookMetadataExporter();
        exporterCSV.add(TestData.sailboatBook);
        exporterCSV.add(TestData.GoFBook);
        exporterCSV.export(System.out);
    }
}
