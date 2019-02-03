package in.codefather.countandsortstrings;

import java.util.Comparator;
import java.util.Map;

public class EntryCountComparator implements Comparator<Map.Entry<String, Integer>>{
	@Override
	public int compare(Map.Entry<String, Integer> arg0, Map.Entry<String, Integer> arg1) {
		return arg0.getValue().compareTo(arg1.getValue());
	}
}