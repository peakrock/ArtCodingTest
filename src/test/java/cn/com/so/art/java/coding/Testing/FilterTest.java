package cn.com.so.art.java.coding.Testing;

import java.util.Arrays;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;
public class FilterTest {

	private List<Product> products;
	private Filter filter;
	@Before
	public void gaven(){
		//gaven
		Product p1 = new Product(Color.RED, 2);
		Product p2 = new Product(Color.GREEN, 11);
		Product p3 = new Product(Color.RED, 20);
		Product p4 = new Product(Color.GREEN, 3);
		Product p5 = new Product(Color.BLUE, 7);
		products = Arrays.asList(p1, p2, p3, p4, p5);
		
		filter = new Filter();
	}
	/*
	 * 1. find all red products
	 * 2. find all blue products
	 * 3. find all weight less than 10 products
	 * 4. find all red and weigth < 10 products
	 * 5. find all red or blue and weight < 10 products;
	 * 6. find all not red products
	 * 7. find all products
	 */
	@Test
	public void whenRedThenFindProducts(){
		//when
		List<Product> results = filter.findByColor(products, new ColorEqualProductSpec(Color.RED));
		
		//then
		assertThat(results.size(), is(2));
	}
	@Test
	public void whenGreenThenFindProducts(){
		//when
		List<Product> results = filter.findByColor(products, new ColorEqualProductSpec(Color.GREEN));
		
		//then
		assertThat(results.size(), is(2));
	}
	@Test
	public void whenWeightLt10ThenFindProducts(){
		//when
		List<Product> results = filter.findByColor(products, new WeightLtProductSpec(10));
		
		//then
		assertThat(results.size(), is(3));
	}
	@Test
	public void whenRedOrGreenAndWeightLt10ThenFindProduct(){
		//when
		List<Product> results = filter.findByColor(products, new AndSpec(new OrSpec(new ColorEqualProductSpec(Color.RED), new ColorEqualProductSpec(Color.GREEN)), new WeightLtProductSpec(10)));
		
		//then
		assertThat(results.size(), is(2));
	}
	@Test
	public void wheNotRedThenFindProduct(){
		//when
		List<Product> results = filter.findByColor(products, new NotColorProductSpec(Color.RED));
		
		//then
		assertThat(results.size(), is(3));
	}
	
//	public void whenRedAndWeightLt10ThenFindProducts(){
//		//when
//		List<Product> results = filter.findByColor(products, new ProductSpec());
//		
//		//then
//		assertThat(results.size(), is(2));
//	}
}
