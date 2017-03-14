package org.kp.service;

import org.kp.dao.FileRollDao;
import org.kp.dao.HDFSDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class FileRollService {
	@Autowired
	FileRollDao frDao;
	
	@Autowired
	HDFSDao hdfsDao;
	
	public String getFileRollContents(String type){
		String value = "";
		try{
			if(type.equals("hadoop")){
				value = frDao.getFileRollFile();
			} else {
				value = hdfsDao.getFileRollFile();
			}
		} catch(Exception e){
			
		}
		
		
		return value;
	}
}
