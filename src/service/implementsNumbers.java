package service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import interfaces.iNumbers;

public class implementsNumbers implements iNumbers{

	@Override
	public List<Integer> removeZero(ArrayList<Integer> num) {
		
		List<Integer> nonZero = num.stream()
									.filter(data->data!=0)						
										.collect(Collectors.toList());
		
		
		return nonZero;
	}

	@Override
	public void sortInAsending(List<Integer> nonZero) {
		
		nonZero.stream()
			.sorted()
				.forEach(data->System.out.println(data));
		
	}

	@Override
	public void sortInDesending(List<Integer> nonZero) {
		
		nonZero.stream()
			.sorted(Collections.reverseOrder())
				.forEach(data->System.out.println(data));
		
	}

	
	
}
