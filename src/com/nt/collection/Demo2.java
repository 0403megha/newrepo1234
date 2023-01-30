package com.nt.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Demo2 {
	public static void main(String[] args) {
		/*
		 * Set<String> fruites = new HashSet(); fruites.add("One apple");
		 * fruites.add("One mango"); fruites.add("One apples");
		 * fruites.add("More Grapes"); fruites.add("Two guavas"); //anyMatch boolean b =
		 * fruites.stream().anyMatch(values -> { return values.startsWith("One"); });
		 * System.out.println(b);
		 * 
		 * 
		 * boolean b1=fruites.stream().noneMatch(value->{return
		 * value.startsWith("one");}); System.out.println(b1); } Optional<String>
		 * opt=fruites.stream().findFirst(); System.out.println(opt.get());
		 * 
		 * Optional<String> opt1=fruites.stream().findAny();
		 * System.out.println(opt1.get());
		 */
		
		
		List<String> animalList=Arrays.asList("dog","cat","elephant");
		List<String> birdList=Arrays.asList("picocok","parrot","crow");
		
		Stream<String> stream1=animalList.stream();
		Stream<String> stream2=birdList.stream();

		List<String> finalList=Stream.concat(stream1, stream2).collect(Collectors.toList());
		for(String str :finalList) {
			System.out.println(str);
		}

		
		
	}
}
