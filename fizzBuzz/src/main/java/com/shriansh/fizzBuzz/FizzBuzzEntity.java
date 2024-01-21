package com.shriansh.fizzBuzz;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "parameters", schema = "public")
public class FizzBuzzEntity {
	
	public FizzBuzzEntity() {
		
	}
	@Id
	@Column(name = "input_1")
	private Integer input1;
	@Column(name = "input_2")
	private Integer input2;
	@Column(name = "input_limit")
	private Integer inputLimit;
	@Column(name = "string_1")
	private String string1;
	@Column(name = "string_2")
	private String string2;
	@Column(name = "count") 
	private Integer count;
	
	public FizzBuzzEntity(Integer input1, Integer input2, Integer inputLimit, String string1, String string2) {
		this.input1 = input1;
		this.input2 = input2;
		this.inputLimit = inputLimit;
		this.string1 = string1;
		this.string2 = string2;
	}

	public Integer getInput1() {
		return input1;
	}

	public void setInput1(Integer input1) {
		this.input1 = input1;
	}

	public Integer getInput2() {
		return input2;
	}

	public void setInput2(Integer input2) {
		this.input2 = input2;
	}

	public Integer getInputLimit() {
		return inputLimit;
	}

	public void setInputLimit(Integer inputLimit) {
		this.inputLimit = inputLimit;
	}

	public String getString1() {
		return string1;
	}

	public void setString1(String string1) {
		this.string1 = string1;
	}

	public String getString2() {
		return string2;
	}

	public void setString2(String string2) {
		this.string2 = string2;
	}

	public Integer getCount() {
		return count;
	}

	public void setCount(Integer count) {
		this.count = count;
	}
	
}
