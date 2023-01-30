package com.nt.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class AddNumbers {
public static void main(String[] args) {
	List<String> i=Arrays.asList("jaya",null,"prneethaklll",null,"guddiii","pallaviiii","tanu","rakhi","riya",null);
	//List<String> p=new ArrayList<String>();
	/*for(Integer o:i) {
		if(o%2==0)
			p.add(o);
	}
	System.out.println(p);
}*/
//i.stream().filter(n->n%2==0).forEach(System.out::println);
//i.stream().filter(n->n%2==0).forEach(o->System.out.println(o));
//p=	i.stream().filter(n->n%2==0).collect(Collectors.toList());
//System.out.println(p);	
//p=i.stream().filter(name->name.length()>6 && name.length()<8).collect(Collectors.toList());	
//System.out.println(p);	
//i.stream().filter(name->name.length()>6 && name.length()<8).forEach(System.out::println);
//i.stream().filter(name->name.length()>6 && name.length()<8).forEach(o->System.out.println(o));
//List<String> result=i.stream().filter(p->p!=null).collect(Collectors.toList());
//System.out.println(result);
//i.stream().filter(p->p!=null).forEach(System.out::println);
i.stream().filter(p->p!=null).forEach(o->System.out.println(o));


}
}
