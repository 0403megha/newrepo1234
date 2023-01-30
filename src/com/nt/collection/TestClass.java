package com.nt.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class TestClass {
	public static void main(String[] args) {
		List<Integer> listInt=new ArrayList<Integer>();
		List<Integer> listname = Arrays.asList(2, 3, 4, 5);
		/*for (Integer i : listname) {
			//System.out.println(i * 3);
			listInt.add(i*3);
		}
		System.out.println(listInt);

	}*/
		/*
		 * listInt=listname.stream().map(num->num*3).collect(Collectors.toList());
		 * System.out.println(listInt); listInt.forEach(System.out::println);
		 * listInt.forEach(p->System.out.println(p));
		 */
		listname.stream().map(num->num*3).forEach(System.out::println);

		
	}

}
