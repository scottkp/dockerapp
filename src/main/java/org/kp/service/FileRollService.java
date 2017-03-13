package org.kp.service;

import org.kp.dao.FileRollDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class FileRollService {
	@Autowired
	FileRollDao frDao;
	
	public String getFileRollContents(){
		String value = "";
		try{
			value = frDao.getFileRollFile();
		} catch(Exception e){
			
		}
		
		
		return value;
	}
}
