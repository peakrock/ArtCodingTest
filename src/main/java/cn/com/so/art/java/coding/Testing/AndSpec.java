package cn.com.so.art.java.coding.Testing;

public class AndSpec implements ProductSpec {

	private ProductSpec[] productSpecs;

	public AndSpec(ProductSpec ...productSpecs) {
		this.productSpecs = productSpecs;
	}

	public boolean validate(Product p) {
		for(ProductSpec spec : productSpecs){
			if(!spec.validate(p))return false;
		}
		return true;
	}

}
