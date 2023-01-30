package com.nt.collection;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamFilterExample {
	public static void main(String[] args) {
		/*
		 * List<Product> list=new ArrayList<Product>(); for(Product
		 * product:getProducts()) { if(product.getPrice()>25000) { list.add(product); }
		 * } for(Product product:list) { System.out.println(product); }
		 */
    
  List<Product> list11=  getProducts().stream().filter(product->product.getPrice()<=25000).collect(Collectors.toList());
  list11.forEach(p->System.out.println(p));  
    
	}

	private static List<Product> getProducts() {
		List<Product> productlist = new ArrayList<Product>();
		productlist.add(new Product(1, "HP LAPTOPS", 25000F));
		productlist.add(new Product(2, "DELL LAPTOPS", 30000F));
		productlist.add(new Product(3, "LENEVO LAPTOPS", 28000F));
		productlist.add(new Product(4, "SONY LAPTOPS", 28000F));
		productlist.add(new Product(1, "APPLE LAPTOPS", 90000F));
		return productlist;
	}
}

class Product {
	private int id;
	private String name;
	private float price;

	public Product(int id, String name, float price) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", price=" + price + "]";
	}

}
