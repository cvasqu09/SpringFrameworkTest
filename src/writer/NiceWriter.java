package writer;

import org.springframework.stereotype.Service;

public class NiceWriter implements IWriter{
	public void writer (String s){
        System.out.println("The string is " + s);
    }
}
