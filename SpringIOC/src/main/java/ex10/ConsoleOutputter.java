package ex10;

import java.io.IOException;

public class ConsoleOutputter implements Outputter {

	private String path;
	
	public String getPath() {
		return path;
	}
	public void setPath(String path) {
		this.path = path;
	}

	@Override
	public void output(String msg) throws IOException {
		System.out.println(msg);
		System.out.println(path);

	}

}
