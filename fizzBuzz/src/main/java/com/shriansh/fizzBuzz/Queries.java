package com.shriansh.fizzBuzz;

public class Queries {

	public static final String FIND_COUNT = "SELECT count FROM public.parameters WHERE "
			+ "input_1 = ? AND input_2 = ? AND input_limit=? "
			+ "AND string_1=? AND string_2 = ?";
	
	public static final String GET_MOST_USED = "SELECT * FROM public.parameters "
			+ " ORDER BY count DESC limit 1";
}
