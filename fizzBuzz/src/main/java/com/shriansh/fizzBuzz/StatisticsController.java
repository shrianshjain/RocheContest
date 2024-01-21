package com.shriansh.fizzBuzz;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StatisticsController {

	@Autowired
	private FizzBuzzService fizzBuzzService;
	
    @RequestMapping(path = "/statistics", method = RequestMethod.POST)
    public FizzBuzzEntity getStatistics() {
        
    	FizzBuzzEntity fizzBuzzEntity = fizzBuzzService.getMostUsedRequest();
    	
    	return fizzBuzzEntity;
    }
}
