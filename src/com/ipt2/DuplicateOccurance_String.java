package com.ipt2;

import java.util.*;
import java.util.Map.Entry;


public class DuplicateOccurance_String {

	public static void main(String[] args) {

		String s1 = "Das and John Are two good friends they are school friends as well";
		String s = s1.toLowerCase();
		String[] sp = s.split(" ");
		
		Map<String,Integer> map= new HashMap <String,Integer>();
		for(String a:sp)
		{
			if(map.containsKey(a))
			{
				Integer i= map.get(a);
				map.put(a, i+1);
			}
			else
				map.put(a, 1);
		}
		Set<Entry<String,Integer>> entryset=map.entrySet();
		for(Entry<String,Integer> entry:entryset)
		{
			System.out.println(entry);
		}
		
	}
}