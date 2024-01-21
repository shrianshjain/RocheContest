package com.shriansh.fizzBuzz;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class FizzBuzzDaoImpl implements FizzBuzzDao{

	@Autowired
	private FizzBuzzRepository fizzBuzzRepo;
	
	@Override
	public void addInput(FizzBuzzEntity payload) {
		fizzBuzzRepo.save(payload);
	}
	
	@Override
	public Integer getCount(FizzBuzzEntity payload) {
		
		Integer input1 = payload.getInput1();
		Integer input2 = payload.getInput2();
		Integer inputLimit = payload.getInputLimit();
		String string1 = payload.getString1();
		String string2 = payload.getString2();
		
		Optional<Integer> countValueOptional = fizzBuzzRepo.getCount(input1,input2,inputLimit,string1,string2);
		
		if (countValueOptional.isPresent()) {
		    Integer count = countValueOptional.get();
		    return count;
		} else {
		    return null;
		}
	}
	
	@Override
	public FizzBuzzEntity getMostUsedRequest() {
		
		FizzBuzzEntity fizzBuzzEntity = fizzBuzzRepo.getMostUsedRequest();
		
		return fizzBuzzEntity;
	}
}
