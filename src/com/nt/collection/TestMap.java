package com.nt.collection;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Stream;

public class TestMap {
public static void main(String[] args) {
	Stream<String> stream =Stream.of("a","b","c");
    stream.forEach(System.out::println);	
    
	/*
	 * Collection<String> collection= Arrays.asList("megha","tanu","pallavi");
	 * Stream<String> stream1= collection.stream();
	 * stream1.forEach(System.out::println);
	 */
    List<String> collection1= Arrays.asList("megha","tanu","pallavi");
    Stream<String> stream2= collection1.stream();
    stream2.forEach(System.out::println);
    
    Set<String> set=new HashSet(collection1);
     Stream<String> ss= set.stream();
     ss.forEach(System.out::println);
    
    String[] s1=new String[] {"A","B","C"};
   Stream<String> d= Arrays.stream(s1);
   d.forEach(System.out::println);
} 
}
