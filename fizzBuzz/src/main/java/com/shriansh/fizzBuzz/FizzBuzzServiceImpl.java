package com.shriansh.fizzBuzz;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class FizzBuzzServiceImpl implements FizzBuzzService{

	@Autowired
	private FizzBuzzDao fizzBuzzDao;
	
	@Override
	public void addInput(FizzBuzzEntity payload) {
		fizzBuzzDao.addInput(payload);
	}
	
	@Override
	public Integer getCount(FizzBuzzEntity payload) {
		return fizzBuzzDao.getCount(payload);
	}
	
	@Override
	public FizzBuzzEntity getMostUsedRequest() {
		return fizzBuzzDao.getMostUsedRequest();
	}
}
