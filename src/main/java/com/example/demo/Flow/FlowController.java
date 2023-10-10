package com.example.demo.Flow;

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
public class FlowController {
	
	@Autowired
    FlowService fs;

    @PostMapping("/flow")
    public String addFlow(@Validated @RequestBody Flow flow)
    {
    	return fs.addFlow(flow);
    }

    @GetMapping("/flow/{appName}")
    public List<Flow> getFlowByAppName(@PathVariable String appName)
    {
    	return fs.getFlowByAppName(appName);
    }
    
    @GetMapping("/flows")
    public List<Flow> getAllFlows()
    {
    	return fs.getAll();
    }

    @DeleteMapping("/flow/{id}")
    public String deleteFlowById(@PathVariable String id)
    {
    	return fs.deleteFlowById(id);
    }

}
