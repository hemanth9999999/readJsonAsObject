package com.JsonExample.config;


import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.util.List;
import com.JsonExample.models.*;
import com.fasterxml.jackson.core.JsonParser.Feature;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class UserConfig {
	
	@Bean(name = "allUsers")
	public List<User> allUsers()
	{ 
		ObjectMapper mapper = new ObjectMapper();
		mapper.configure(Feature.AUTO_CLOSE_SOURCE, true);
		List<User> users = null ;
		TypeReference<List<User>> typeReference = new TypeReference<List<User>>(){};
		File initialFile = new File("C:\\Users\\Hemanth\\Desktop\\json_file.json");
 
		
		try {
			InputStream inputStream = new FileInputStream(initialFile) ;
			System.out.println("Input Stream is : "+inputStream ) ;
			users = mapper.readValue(inputStream,typeReference);
		} catch (Exception e) {
			System.out.println("Exception caused : " + e) ; 
		}
		
		return users ; 
	
	}
	

}
