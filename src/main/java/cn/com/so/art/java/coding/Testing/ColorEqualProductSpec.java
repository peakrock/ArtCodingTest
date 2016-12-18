package cn.com.so.art.java.coding.Testing;

public class ColorEqualProductSpec implements ProductSpec {

	private Color color;

	public ColorEqualProductSpec(Color color) {
		this.color = color;
	}

	public boolean validate(Product p) {
		return p.getColor() == this.color;
	}

}
