package cn.com.so.art.java.coding.Testing;

public class OrSpec implements ProductSpec{

	private ProductSpec[] specs;

	public OrSpec(ProductSpec ... specs) {
		this.specs = specs;
	}

	public boolean validate(Product p) {
		for(ProductSpec sp: specs){
			if(sp.validate(p)) return true;
		}
		return false;
	}

}
