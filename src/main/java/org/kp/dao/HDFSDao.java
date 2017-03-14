package org.kp.dao;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

import org.kp.util.ApplicationConstants;
import org.springframework.stereotype.Service;

@Service
public class HDFSDao {

	
	public String getFileRollFile() throws IOException {
		
		File folder = new File(ApplicationConstants.HDFS_PATH);
		File[] listOfFiles = folder.listFiles();
		
		if(listOfFiles != null){
		    for (int i = 0; i < listOfFiles.length; i++) {
		      if (listOfFiles[i].isFile()) {
		    	StringBuffer content = new StringBuffer();
		        System.out.println("File " + listOfFiles[i].getPath());
		        
		        FileReader fr = new FileReader(new File(listOfFiles[i].getPath()));
		        BufferedReader br = new BufferedReader(fr);
		        
				String sCurrentLine;
				while ((sCurrentLine = br.readLine()) != null) {
					content.append(sCurrentLine);
				}
				
		        System.out.println("File Contents" + content);
		        
		        fr.close();
		        br.close();
		        
		        return content.toString();
		      }
		    }
		}
		
		return null;
	}
}
