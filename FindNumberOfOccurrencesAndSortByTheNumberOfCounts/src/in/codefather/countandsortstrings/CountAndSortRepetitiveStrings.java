package in.codefather.countandsortstrings;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CountAndSortRepetitiveStrings {

	private String[] input;
	private Map<String, Integer> stringRepetitionCountMap = new HashMap<>();
	public CountAndSortRepetitiveStrings(String[] input) {
		this.input = input;
	}
	
	public void countRepetitions() {
		for(String string : input) {
			Integer count = stringRepetitionCountMap.putIfAbsent(string, 1);
			if(count!=null) {
				stringRepetitionCountMap.put(string, count+1);
			}
		}
	}
	
	public void sortInAscendingOrderOfRepetitions() {
		List<Map.Entry<String, Integer>> entrySet = new ArrayList<>(stringRepetitionCountMap.entrySet());
		Collections.sort(entrySet,new EntryCountComparator());
		System.out.println(entrySet);
	}
}