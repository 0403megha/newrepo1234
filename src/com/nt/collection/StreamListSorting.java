package com.nt.collection;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StreamListSorting {
	public static void main(String[] args) {
		/*
		 * List<String> fruits = new ArrayList<String>(); fruits.add("banana");
		 * fruits.add("apple"); fruits.add("mango"); fruits.add("orange"); List<String>
		 * lists = fruits.stream().sorted().collect(Collectors.toList());
		 * System.out.println(lists); List<String> lists1 =
		 * fruits.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList()
		 * ); System.out.println(lists1); List<String> lists12 =
		 * fruits.stream().sorted((o1,o2)->o2.compareTo(o1)).collect(Collectors.toList()
		 * ); System.out.println(lists12);
		 */

		List<Employee> employe = new ArrayList<Employee>();
		employe.add(new Employee(10, "Ramesh", 30, 400000));
		employe.add(new Employee(20, "Santosh", 29, 350000));
		employe.add(new Employee(30, "Sanjay", 30, 450000));
		employe.add(new Employee(40, "Pramod", 29, 500000));
	List<Employee> i=	employe.stream().sorted((o1,o2)-> (int)(o2.getSalary()-o1.getSalary())).collect(Collectors.toList());
i.forEach(System.out::println);
	}
}
