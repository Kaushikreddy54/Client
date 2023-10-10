package com.example.demo.Flow;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FlowRepository extends MongoRepository<Flow,String>{
	
	List<Flow> findFlowByAppName(String appName);

}
