package com.example.demo.Application;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ApplicationService {
	
	@Autowired
    ApplicationRepository ar;
	
    public String addProduct(Application app)
    {
        ar.save(app);
        return app.getAppName()+" is added successfully";
    }
    
    public List<Application> getApplicationByAppNameAndAppType(String appName,String appType)
    {
        return ar.findByAppNameAndAppType(appName,appType);
    }
    
    public List<Application> getAll()
    {
    	return ar.findAll();
    }
    
    public String deleteApplicationById(String id)
    {
        ar.deleteById(id);
        return id+" deleted successfully";
    }

}
