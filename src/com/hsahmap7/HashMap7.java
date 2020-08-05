package com.hsahmap7;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMap7 {

	public static void main(String[] args) {
		Map<String,Integer> map=new HashMap<>();
		map.put("abc", 101);
		map.put("def", 789);
		map.put("ghi", 456);
		map.put("jkl", 123);
		
		Set<Entry<String,Integer>> entry=map.entrySet();
		Iterator<Entry<String,Integer>> ite=entry.iterator();
		while(ite.hasNext()) {
			Map.Entry<String,Integer> e=ite.next();
			System.out.println(e.getKey()+" "+e.getValue());
		}

	}

}
