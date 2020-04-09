package com.util.help;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapExample {

	public static void main(String[] args) {
		Map<String, Integer> hm = new HashMap<String, Integer>();
		hm.put("a", 1);
		hm.put("d", 2);
		hm.put("b", 3);
		hm.put("c", 4);
		//System.out.println(hm);
		for(Map.Entry<String, Integer> m : hm.entrySet()) {
			System.out.println(m.getKey() + " "+m.getValue());
		}

		Map<String, Integer> lhm = new LinkedHashMap<String, Integer>();
		lhm.put("a", 1);
		lhm.put("d", 2);
		lhm.put("b", 3);
		lhm.put("c", 4);
		System.out.println(lhm);

		Map<String, Integer> tm = new TreeMap<String, Integer>();
		tm.put("a", 1);
		tm.put("d", 2);
		tm.put("b", 3);
		tm.put("c", 4);
		System.out.println(tm);

	}

}
