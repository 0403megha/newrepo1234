package com.nt.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Test {
public static void main(String[] args) {
	List<Integer> list=new ArrayList<Integer>();
	list.add(9);
	list.add(19);
	list.add(20);
	list.add(12);
	list.add(4);
	list.stream().forEach(obj->System.out.print("  "+obj));
	System.out.println();
	list.stream().sorted().forEach(obj->System.out.print("  "+obj));
	Collections.reverse(list);
	System.out.println(list);




}
}
