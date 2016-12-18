package cn.com.so.art.java.coding.Testing;

public class NotColorProductSpec implements ProductSpec {

	private Color color;

	public NotColorProductSpec(Color color) {
		this.color = color;
	}

	public boolean validate(Product p) {
		return p.getColor() != this.color;
	}

}
