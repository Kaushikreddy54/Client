package com.example.demo.Flow;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Application.Application;
import com.example.demo.Application.ApplicationService;

@Service
public class FlowService {
	
	@Autowired
    FlowRepository fr;
    @Autowired
    ApplicationService as;
    public String addFlow(Flow flow)
    {
        fr.save(flow);
        return flow.getAppName()+" is added successfully";
    }
    public List<Flow> getFlowByAppName(String appName)
    {
        List<Flow> flow=fr.findFlowByAppName(appName).stream().toList();
        List<Application> javas=as.getApplicationByAppNameAndAppType(appName,"java");
        List<Application> pythons=as.getApplicationByAppNameAndAppType(appName,"python");
        if(flow.size()>0) {
        	flow.get(0).setJavaCount(javas.stream().toList().size());
        	flow.get(0).setPythonCount(pythons.stream().toList().size());
        	flow.get(0).setJavas(javas);
        	flow.get(0).setPythons(pythons);
        }
        return flow;

    }
    
    public List<Flow> getAll()
    {
    	return fr.findAll();
    }
    
    public String deleteFlowById(String id)
    {
        fr.deleteById(id);
        return id+" deleted successfully";
    }

}
