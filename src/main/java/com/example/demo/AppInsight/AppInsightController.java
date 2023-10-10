package com.example.demo.AppInsight;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AppInsightController {
	
	@Autowired
	AppInsightService ais;

    @PostMapping("/apis")
    public String addAppInsight(@Validated @RequestBody AppInsight ai)
    {
    	return ais.addAppInsight(ai);
    }

    @GetMapping("/apis/{appName}")
    public List<AppInsight> getAppInsightByAppName(@PathVariable String appName)
    {
    	return ais.getAppInsightByAppName(appName);
    }
    
    @GetMapping("/apises")
    public List<AppInsight> getAllAppInsights()
    {
    	return ais.getAll();
    }

    @DeleteMapping("/apis/{id}")
    public String deleteAppInsight(@PathVariable String id)
    {
    	return ais.deleteAppInsight(id);
    }

}
