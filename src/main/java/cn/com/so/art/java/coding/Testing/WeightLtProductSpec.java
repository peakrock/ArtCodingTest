package cn.com.so.art.java.coding.Testing;

public class WeightLtProductSpec implements ProductSpec {

	private int weight;

	public WeightLtProductSpec(int weight) {
		this.weight = weight;
	}

	public boolean validate(Product p) {
		return p.getWeight() < this.weight ;
	}

}
