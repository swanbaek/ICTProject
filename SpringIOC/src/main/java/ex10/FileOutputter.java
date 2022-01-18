package ex10;

import java.io.FileWriter;
import java.io.IOException;

public class FileOutputter implements Outputter {

	private String path;
	
	public String getPath() {
		return path;
	}
	public void setPath(String path) {
		this.path = path;
	}

	@Override
	public void output(String msg) throws IOException {
		//���Ͽ� ���
		FileWriter fw=new FileWriter(path, true);
		fw.write(msg);
		fw.flush();
		fw.close();

	}

}



