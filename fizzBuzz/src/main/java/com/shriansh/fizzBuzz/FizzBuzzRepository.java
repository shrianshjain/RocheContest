package com.shriansh.fizzBuzz;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface FizzBuzzRepository extends JpaRepository<FizzBuzzEntity, Long>{

	@Query(value = Queries.FIND_COUNT, nativeQuery = true)
	public Optional<Integer> getCount(Integer input1,Integer input2,Integer inputLimit,String string1, String string2);
	
	@Query(value = Queries.GET_MOST_USED, nativeQuery = true)
	public FizzBuzzEntity getMostUsedRequest();
}
