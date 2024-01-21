package com.shriansh.fizzBuzz;

public interface FizzBuzzDao {

	public void addInput(FizzBuzzEntity payload);

	public Integer getCount(FizzBuzzEntity payload);
	
	public FizzBuzzEntity getMostUsedRequest();
}
