package com.sujata.mapdemos;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapDemo {

	public static void main(String[] args) {
		//TreeMap: Sorted collection of key value pair and Sorting is wrt keys. and keys will b unique but values can be duplicated
		Map<String,Integer> months=new TreeMap<>();
		months.put("Jan", 31);
		months.put("Feb", 28);
		months.put("Mar", 31);
		months.put("Apr", 30);
		months.put("May", 31);
		System.out.println(months);
		
		Set<String> mnths=months.keySet();
		for(String month:mnths){
			System.out.println("Total no of days in "+month+" : "+months.get(month));
		}
		
		System.out.println("===================");
		Iterator<String> iterator=mnths.iterator();
		while(iterator.hasNext()){
			String monthName=iterator.next();
			System.out.println("Total no of days in "+monthName+" : "+months.get(monthName));
		}

	}

}
