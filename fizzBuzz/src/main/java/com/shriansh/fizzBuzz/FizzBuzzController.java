package com.shriansh.fizzBuzz;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import java.util.ArrayList;
import java.util.List;

@RestController
public class FizzBuzzController {

	@Autowired
	private FizzBuzzService fizzBuzzService;
	
    @RequestMapping(path = "/fizzbuzz", method = RequestMethod.POST)
    public List<String> fizzBuzz(@RequestBody FizzBuzzEntity payload) {
    	
    	Integer count = fizzBuzzService.getCount(payload);
    	
    	if(count==null) {
    		count=0;
    	}
    	
    	count++;
    	
    	payload.setCount(count);
    	fizzBuzzService.addInput(payload);
    	
    	List<String> result = new ArrayList<>();
    	
    	int input1 = payload.getInput1();
    	int input2 = payload.getInput2();
    	int inputLimit = payload.getInputLimit();
    	String string1 = payload.getString1();
    	String string2 = payload.getString2();
    	
        for (int i = 1; i <= inputLimit; i++) {
            if (i % (input1 * input2) == 0) {
                result.add(string1 + string2);
            } else if (i % input1 == 0) {
                result.add(string1);
            } else if (i % input2 == 0) {
                result.add(string2);
            } else {
                result.add(String.valueOf(i));
            }
        }

        return result;
    }
}
