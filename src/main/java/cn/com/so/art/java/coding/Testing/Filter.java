package cn.com.so.art.java.coding.Testing;

import java.util.ArrayList;
import java.util.List;

public class Filter {

	public List<Product> findByColor(List<Product> products, ProductSpec productSpec) {
		List<Product> results = new ArrayList<Product>();
		for(Product p: products){
			if(productSpec.validate(p)){
				results .add(p);
			}
		}
		return results;
	}

}
