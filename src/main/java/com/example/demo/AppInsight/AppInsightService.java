package com.example.demo.AppInsight;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Flow.FlowService;

@Service
public class AppInsightService {
	
	@Autowired
    AppInsightRepository air;
    @Autowired
    FlowService fs;
    
    public String addAppInsight(AppInsight ai)
    {
        air.save(ai);
        return ai.getAppName()+" is added successfully";
    }
    
    public List<AppInsight> getAppInsightByAppName(String appName)
    {
        List<AppInsight> ai=air.findByAppName(appName).stream().toList();
        Object flow =fs.getFlowByAppName(appName);
        ai.get(0).setFlow(flow);
        return ai;
    }
    
    public List<AppInsight> getAll()
    {
    	return air.findAll();
    }
    
    public String deleteAppInsight(String id)
    {
        air.deleteById(id);
        return id+" deleted successfully";
    }

}
