package com.example.demo.Flow;

import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.Transient;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Data
@Document(collection="A-2")
public class Flow {
	
	@Id
	   public String id;
		private String appName;
		private int javaCount;
	    @Transient
	    private Object javas;
	    private int pythonCount;
	    @Transient
	    private Object pythons;

}
