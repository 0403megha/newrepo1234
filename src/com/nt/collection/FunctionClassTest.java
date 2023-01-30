package com.nt.collection;

import java.util.function.Function;

public class FunctionClassTest {
public static void main(String[] args) {
	Function<Integer, Integer> function=n->n*n;
	System.out.println(function.apply(5));
	System.out.println(function);
	Function<String, Integer> fun1=n->n.length();
	System.out.println(fun1.apply("megha"));
	
}
}
