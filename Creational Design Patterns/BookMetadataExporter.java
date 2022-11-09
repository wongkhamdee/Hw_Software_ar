package creational;

import javax.xml.stream.XMLStreamException;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintStream;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;

public abstract class BookMetadataExporter extends BookCollection {
	// Please implement this method. You may create additional methods as you see fit.
    private final ArrayList<Book> bookList = new ArrayList<Book>();
    public abstract void export(PrintStream stream) throws IOException, XMLStreamException;

    public ArrayList<Book> getBookList(){
        return bookList;
    }

    public void add(Book book){
        bookList.add(book);
    }
}
