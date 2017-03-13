package org.kp.dao;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.springframework.stereotype.Service;

@Service
public class FileRollDao {

	
	public String getFileRollFile() throws IOException{
		
		File folder = new File("/opt/lib/flume/data");
		File[] listOfFiles = folder.listFiles();
		
		if(listOfFiles != null){
		    for (int i = 0; i < listOfFiles.length; i++) {
		      if (listOfFiles[i].isFile()) {
		        System.out.println("File " + listOfFiles[i].getPath());
		        
		        FileReader fr = new FileReader(new File(listOfFiles[i].getPath()));
		        String content = fr.toString();
		        System.out.println("File Contents" + content);
		        fr.close();
		        
		        return content;
		      }
		    }
		}
		
		return null;
	}
}
