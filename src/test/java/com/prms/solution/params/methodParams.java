package com.prms.solution.params;

import java.util.ArrayList;
import java.util.stream.Stream;

import org.junit.jupiter.params.provider.Arguments;

import com.prms.util.MathUtil; 

class methodParams {
	
	@SuppressWarnings("unused")
	private static Stream<Arguments> 과일장수() {
		
		int numbers = 
			MathUtil.getRandomInt(10* 10* 10* 10* 10* 10* 10* 10* 10)
				/ MathUtil.getPowTenInt(MathUtil.getRandomInt(9)); 
		
        int[] array = (new ArrayList<Integer>(){
	        	int num = numbers; 
				private static final long serialVersionUID = 1L;
				{ 
					do{ add(num % 10); num /= 10; } 
					while (num > 0);
				}
			}
        ).stream().mapToInt(Integer::intValue).toArray();
		
		return Stream.of(
			Arguments.of(
					MathUtil.getRandomInt(9)
					, MathUtil.getRandomInt(9)
					, array
				)
			);
	}
	
}
