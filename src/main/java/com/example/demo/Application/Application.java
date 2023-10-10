package com.example.demo.Application;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Data
@Document(collection="A-1")
public class Application {
	
	@Id
	public String id;
	private String productName;
	private String appName;
	private String appType;

}
