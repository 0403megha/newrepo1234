package com.nt.collection;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;


class FilterDemo{
	public static void main(String[] args) {
	List<Product> productlist=new ArrayList<Product>();
	productlist.add(new Product(1, "HP LAPTOPS", 25000));
	productlist.add(new Product(2, "DELL LAPTOPS", 30000));
	productlist.add(new Product(4, "SONY LAPTOPS", 28000));
	productlist.add(new Product(1, "APPLE LAPTOPS", 90000));
	//List<Product> y=productlist.stream().filter(o->o.getPrice()>25000).collect(Collectors.toList());
	//System.out.println(y);
	//productlist.stream().filter(o->o.getPrice()>25000).forEach(System.out::println);
	productlist.stream().filter(o->o.getPrice()>25000).forEach(i->System.out.println(i.getPrice()));

	}
	public class Product1 {
		private int id;
		private String name;
		private double price;
		public Product1(int id, String name, double price) {
			super();
			this.id = id;
			this.name = name;
			this.price = price;
		}
		}
}

