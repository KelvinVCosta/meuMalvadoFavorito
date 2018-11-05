package fileManager;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadFile {
	
	String fileContent;
	
	public String getFileContent() {
		return fileContent;
	}

	private String reader(String filePath) throws IOException {
		File file = new File(filePath); 
		BufferedReader br = new BufferedReader(new FileReader(file)); 

		String str;
		StringBuilder sb = new StringBuilder(); 
		while ((str = br.readLine()) != null) {
			sb.append(str);
		}
		
		br.close();
		
		return sb.toString();
			 
	}
	
	public ReadFile(String filePath) {
		try {
			this.fileContent = reader(filePath);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

