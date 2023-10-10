package com.example.demo.AppInsight;

import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.Transient;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Data
@Document(collection="A-3")
public class AppInsight {
	
	@Id
	public String id;
	private String appName;
	private String clientName;
	private String region;
    @Transient
    private Object flow;

}
