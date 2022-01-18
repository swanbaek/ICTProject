package ex10;
import java.io.*;

public interface Outputter {
	
	void output(String msg) throws IOException;

}//ConsoleOutputter, FileOutputter
